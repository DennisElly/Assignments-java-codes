   public class Main extends javax.swing.JFrame  {





   public Main()  {
      initComponents();
   }

   int newid;
   String uname;
   String usertype;


   public Main(int id,String username,String utype) {
      initComponents();

      this.uname = username;
      jLabel4.setText(uname);

      this.usertype = utype;
       jLabel4.setText(usertype);
      this.newid = id;