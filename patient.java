  import java.sql.Connection;
  import java.sql.Drivermanager;
  import java.sql.PreparedStatement;
  import java.sql.SQLException;
  import java.sql.logging.Level;
  import java.sql.logging.Logger;

 



 public class Patient extends javax.swing.JFrame  {


    public Patient()   {
        initComponents();
        Connect();
        AutoID();
        patient_table();
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


  }


  
   public void AutoID()
   {
    
    try  {
      Statement s = con.createStatement();
      rs = s.executeQuery("select MAX(patientno)  from patient");
      rs.next();
      rs.getString("MAX(patientno)")== null)
       {


       jLabel5.setText("PS001");

       else
       }
          long id = Long.parselLong(rs.getString("MAX(patientno)").substring(2,rs.getString("MAX(patientno)").length()));
          id++;

         jLabel5.setText("PS"+String.format("%03d", id);
       
       }


      } catch  (SQLException ex)  {
        Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
      }


     private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {


     String pno = lnlpno.getText();
     String pname= txtpname.getText();
     String phone = txtphone.getText();
     String address = txtaddress.getText();


     try {
     pst = con.prepareStatement("insert into patient(patientno,name,phone,address)values(?,?,?,?)");
     pst.setString(1, pno);
     pst.setString(1, pname);
     pst.setString(1, phone);
     pst.setString(1, address);
     pst.executeUpdate();
    
     JOptionPane.showMessageDialog(this, "Patient Insertedddddddd");
      
       AutoID();
       txtpname.setText("");
       txtphone.setText("");
       txtaddress.setText("");
       txtpname.requestFocus();
      





     } catch (SQLException ex)  {
        Logger.getLogger(Patient.class.getName()).log(Level. SEVERE, null, ex);




   }



    public void patient_table()
  {


    try {
     pst = con.prepareStatement("select * from patient");
     rs = pst.execute query();


     ResultSetMetaData Rsm = rs.getMetaData();
      int c;
       c = Rsm.getColumnCount();
         
       DefaultTableModel df = (DefaultTableModel)jTable1.getModel1();
       df.setRowCount(0);
       


       while(rs.next())
       {
         vector v2 = new Vector();

         for(int i=1; i<= c; i++)
         v2.add(rs.getString("patientno"));
         v2.add(rs.getString("name"));
         v2.add(rs.getString("phone"));
         v2.add(rs.getString("address"));
        }

           df.addRow(v2);

        }
         
     


    




     
     } catch (SQLException ex)  {
        Logger.getLogger(Patient.class.getName()).log(Level. SEVERE, null, ex);
     }









