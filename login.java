  import java.sql.Connection;
  import java.sql.Drivermanager;
  import java.sql.PreparedStatement;
  import java.sql.SQLException;
  import java.sql.logging.Level;
  import java.sql.logging.Logger;





  public class Login extends javax.swing.Jframe  {


    public Login()  {
        initComponents();
        Connect();
    }


     connection con;
     PreparedStatement pst;
      ResultSet rs;


       public void connect()
       {

    try {
         class.forName("com.mysql.jdbc.Driver");
         con= DriverManager.getConnection("jdbc:mysql://localhost/loyalhospital","root","");

    } catch(ClassNotFoundException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    } catch(SQLException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);



  }









     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)  {

     String username = txtusername.getText();
     String password = txtpass.getText();
     String utype = txtutype.getSelectedItem().toString();



    try  {
         pst = con.prepareStatement("select * from user where username= ? and password = ? and utype = ?");
         pst.setString(1, username);
         pst.setString(2, password);
         pst.setString(3, utype);


         rs=pst.executeQuery();

         if(rs.next())
         (
            int userid = rs.getInt("id");
            this.setVisible(false);
            new Main(userid,username,password);.setVisible(true);
         }

         else
          {
              JOptionPane.showMessageDialog(this, "UserName or Password do not Match");
              txtusername.setText("");
              txtpass.setText("");
              txtutype.setSelectedIndex(-1);
              txtusername.requestFocus();


      } catch (SQLException ex)  {
          Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }

 
   
