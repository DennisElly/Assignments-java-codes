  import java.sql.Connection;
  import java.sql.Drivermanager;
  import java.sql.PreparedStatement;
  import java.sql.SQLException;
  import java.sql.logging.Level;
  import java.sql.logging.Logger;




Public class User extends javax.swing.Jframe {

       public User() {
              initComponents();
       }
       Connection con;
       PreparedStatement pst;



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
      

    String name = txtname.getText();
    String username = txtusername.getText();
    String password = txtpassword.getText();
    String usertype = txtutype.getSelectedItem().toString();


  try {
    pst = con.preparedStatement("insert into user(name,username,password,utype)values(?,?,?,?)");
    pst.setString(1,name);
    pst.setString(2,username);
    pst.setString(3,password);
    pst.setString(4,usertype);
    pst.executeUpdate();

    JOptionPane.showMessageDialog(this, "User Inserteddddddd");

    txtname.setText("");
    txtusername.setText("");
    txtpassword.setText("");
    txtutype.setSelectedIndex(-1);
    txtname.requestFocus();



   } catch (SQLException ex)  {
     Logger.getLogger(User.class.getName()).Log(LEVEL>SEVERE, null, ex);
   }




   private void jButton2ActionPerfomed(java.awt.event.actionEvent evt)  {


   this.setVisible(false);