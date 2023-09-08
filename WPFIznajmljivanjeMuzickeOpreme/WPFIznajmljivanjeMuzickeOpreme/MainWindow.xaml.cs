using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Configuration;
using System.Globalization;
using System.ComponentModel;
using System.Data.SqlTypes;

namespace WPFIznajmljivanjeMuzickeOpreme
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            prikazTabele();
        }

        private void prikazTabele()
        {

            SqlConnection konekcija = new SqlConnection();
            konekcija.ConnectionString = ConfigurationManager.ConnectionStrings["BazaIznajmljivanjeMuzickeOpreme"].ConnectionString;
            konekcija.Open();
            SqlCommand komanda = new SqlCommand();
            komanda.CommandText = "SELECT * FROM [Oprema]";
            komanda.Connection = konekcija;
            SqlDataAdapter dataAdapter = new SqlDataAdapter(komanda);
            DataTable tabela = new DataTable("Oprema");
            dataAdapter.Fill(tabela);

            Tabela.ItemsSource = tabela.DefaultView;
        }

        private void ponistiUnos()
        {
            txtID_opreme.Text = "";
            cbxTip.SelectedValue = "";
            txtProizvodjac.Text = "";
            txtNaziv.Text = "";
            txtCena.Text = "";
            dtDatum_iznajmljivanja.Text = "";
            dtDatum_vracanja.Text = "";
        }

        private void Dodaj_Klik(object sender, RoutedEventArgs e)
        {
            SqlConnection konekcija = new SqlConnection();
            konekcija.ConnectionString = ConfigurationManager.ConnectionStrings["BazaIznajmljivanjeMuzickeOpreme"].ConnectionString;
            konekcija.Open();
            SqlCommand komanda = new SqlCommand();
            komanda.CommandText = "INSERT INTO [Oprema](Tip, Proizvodjac, Naziv, Cena, Datum_iznajmljivanja, Datum_vracanja) VALUES(@Tip, @Proizvodjac, @Naziv, @Cena, @Datum_iznajmljivanja, @Datum_vracanja)";
            komanda.Parameters.AddWithValue("@Tip", cbxTip.Text);
            komanda.Parameters.AddWithValue("@Proizvodjac", txtProizvodjac.Text);
            komanda.Parameters.AddWithValue("@Naziv", txtNaziv.Text);
            komanda.Parameters.AddWithValue("@Cena", txtCena.Text);
            komanda.Parameters.AddWithValue("@Datum_iznajmljivanja", dtDatum_iznajmljivanja.SelectedDate ?? (object)DBNull.Value);
            komanda.Parameters.AddWithValue("@Datum_vracanja", dtDatum_vracanja.SelectedDate ?? (object)DBNull.Value);

            komanda.Connection = konekcija;
            int provera = komanda.ExecuteNonQuery();
            if (provera == 1)
            {
                MessageBox.Show("Podaci su uspešno upisani!");
                prikazTabele();
            }
            ponistiUnos();
        }

        private void Tabela_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

            DataGrid dg = sender as DataGrid;
            DataRowView dr = dg.SelectedItem as DataRowView;
            if (dr != null)
            {
                txtID_opreme.Text = dr["ID_opreme"].ToString();
                cbxTip.Text = dr["Tip"].ToString();
                txtProizvodjac.Text = dr["Proizvodjac"].ToString();
                txtNaziv.Text = dr["Naziv"].ToString();
                txtCena.Text = dr["Cena"].ToString();
                dtDatum_iznajmljivanja.Text = dr["Datum_iznajmljivanja"].ToString();
                dtDatum_vracanja.Text = dr["Datum_vracanja"].ToString();
            }
        }

        private void Izmeni_Klik(object sender, RoutedEventArgs e)
        {
            SqlConnection konekcija = new SqlConnection();
            konekcija.ConnectionString = ConfigurationManager.ConnectionStrings["BazaIznajmljivanjeMuzickeOpreme"].ConnectionString;
            konekcija.Open();
            SqlCommand komanda = new SqlCommand();
            komanda.CommandText = "UPDATE [Oprema] SET Tip = @Tip, Proizvodjac = @Proizvodjac, Naziv = @Naziv, Cena = @Cena, Datum_iznajmljivanja = @Datum_iznajmljivanja, Datum_vracanja = @Datum_vracanja WHERE ID_opreme = @ID_opreme";
            komanda.Parameters.AddWithValue("@ID_opreme", txtID_opreme.Text);
            komanda.Parameters.AddWithValue("@Tip", cbxTip.Text);
            komanda.Parameters.AddWithValue("@Proizvodjac", txtProizvodjac.Text);
            komanda.Parameters.AddWithValue("@Naziv", txtNaziv.Text);
            komanda.Parameters.AddWithValue("@Cena", txtCena.Text);
            komanda.Parameters.AddWithValue("@Datum_iznajmljivanja", dtDatum_iznajmljivanja.SelectedDate ?? (object)DBNull.Value);
            komanda.Parameters.AddWithValue("@Datum_vracanja", dtDatum_vracanja.SelectedDate ?? (object)DBNull.Value);

            komanda.Connection = konekcija;
            int provera = komanda.ExecuteNonQuery();
            if (provera == 1)
            {
                MessageBox.Show("Podaci su uspešno promenjeni!");
                prikazTabele();
            }
            ponistiUnos();
        }

        private void Obrisi_Klik(object sender, RoutedEventArgs e)
        {
            SqlConnection konekcija = new SqlConnection();
            konekcija.ConnectionString = ConfigurationManager.ConnectionStrings["BazaIznajmljivanjeMuzickeOpreme"].ConnectionString;
            konekcija.Open();
            SqlCommand komanda = new SqlCommand();
            komanda.CommandText = "DELETE FROM [Oprema] WHERE ID_opreme = @ID_opreme";
            komanda.Parameters.AddWithValue("@ID_opreme", txtID_opreme.Text);
            komanda.Connection = konekcija;
            int provera = komanda.ExecuteNonQuery();
            if (provera == 1)
            {
                MessageBox.Show("Podaci su uspešno obrisani");
                prikazTabele();
            }
            ponistiUnos();
        }

        private void Filtriraj_Klik(object sender, RoutedEventArgs e)
        {
            ICollectionView prikazi = CollectionViewSource.GetDefaultView(Tabela.ItemsSource);
            prikazi.SortDescriptions.Clear();

            string izabranaCena = (cbxFilter_cena.SelectedItem as ComboBoxItem)?.Content.ToString();
            string izabraniTip = (cbxFilter_tip.SelectedItem as ComboBoxItem)?.Content.ToString();

            if (izabranaCena == "Od najniže")
            {
                prikazi.SortDescriptions.Add(new SortDescription("Cena", ListSortDirection.Ascending));
            }
            else if (izabranaCena == "Od najviše")
            {
                prikazi.SortDescriptions.Add(new SortDescription("Cena", ListSortDirection.Descending));
            }

            if (izabraniTip == "Abecedno uzlazno")
            {
                prikazi.SortDescriptions.Add(new SortDescription("Tip", ListSortDirection.Ascending));
            }
            else if (izabraniTip == "Abecedno silazno")
            {
                prikazi.SortDescriptions.Add(new SortDescription("Tip", ListSortDirection.Descending));
            }
        }
    }
}
