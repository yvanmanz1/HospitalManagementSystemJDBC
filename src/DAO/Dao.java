

package DAO;
import Model.Appoints;
import Model.Bill;
import Model.Doctors;
import Model.GetAppt;
import Model.LogIn;
import Model.MedicalRecs;
import java.sql.*;
import java.util.*;
import Model.Signup;
import Model.User;

/**
 *
 * @author hp
 */
public class Dao {
    private String dbUrl="jdbc:mysql://localhost:3306/health_care_management_system_db";
    private String username="root";
    private String password="";
    
    //Inserting users
 public String createuser(Signup Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="insert into users (fullnames,email,phone_number,password) values(?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, Obj.getName());
           pst.setString(2, Obj.getEmail());
           pst.setString(3, Obj.getPhone());
           pst.setString(4, Obj.getPassword());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Account created";
           }else{

               return "Not created";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
 //login users
  public boolean authenticateUser(LogIn Obj) {
        try {
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            String query = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Obj.getEmail());
            pst.setString(2, Obj.getPassword());

            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
            // If a row exists, user is authenticated
            String retrievedEmail = resultSet.getString("email");
            String retrievedPassword = resultSet.getString("password");
            Obj.setEmail(retrievedEmail);
            Obj.setPassword(retrievedPassword);// Set the LogIn object's email with the retrieved email
            return true;
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
  //retrieving all users (admin)
  public List<Signup> allUsers(){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, password);
           String sql="select * from users";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet result = pst.executeQuery();
           List<Signup> userList = new ArrayList<>();
           while(result.next()){
               Signup Obj = new Signup();
               Obj.setId(result.getInt("id"));
               Obj.setName(result.getString("fullnames"));
               Obj.setEmail(result.getString("email"));
               Obj.setPhone(result.getString("phone_number"));
               Obj.setPassword(result.getString("password"));
               userList.add(Obj);
           }
           con.close();
           return userList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
  //insert doctors
  public String createdoctor(Doctors Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="insert into doctor (dept_id,email,password,name) values(?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setInt(1, Obj.getDepid());
           pst.setString(2, Obj.getEmail());
           pst.setString(3, Obj.getPassword());
           pst.setString(4, Obj.getName());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Doctor account created";
           }else{

               return "Not created";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
  //updating doctors(admin)
   public String updatedoctor(Doctors Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="update doctor set dept_id=?,password=?,name=? where email=?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setInt(1, Obj.getDepid());
           pst.setString(4, Obj.getEmail());
           pst.setString(2, Obj.getPassword());
           pst.setString(3, Obj.getName());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Doctor account Updated";
           }else{

               return "Not updated";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
   //deleting doctors (admin)
      public String deletedoctor(Doctors Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="delete from doctor where email=?";
           PreparedStatement pst = con.prepareStatement(sql);
          
           pst.setString(1, Obj.getEmail());
           
           
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Doctor account Deleted";
           }else{

               return "Not deleted";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
      //all doctors
        public List<Doctors> allDoctors(){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, password);
           String sql="select * from doctor";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet result = pst.executeQuery();
           List<Doctors> doctorList = new ArrayList<>();
           while(result.next()){
               Doctors Obj = new Doctors();
               Obj.setDepid(result.getInt("dept_id"));
               Obj.setName(result.getString("name"));
               Obj.setEmail(result.getString("email"));
               Obj.setPassword(result.getString("password"));
               doctorList.add(Obj);
           }
           con.close();
           return doctorList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
        //insert appointment
      public String sendappointment(Appoints Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="insert into appointment (fullnames,email,phone_number,department,doctor,day,insurance,time,patient_id) values(?,?,?,?,?,?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, Obj.getName());
           pst.setString(2, Obj.getEmail());
           pst.setString(3, Obj.getPhone());
           pst.setString(4, Obj.getDepartment());
           pst.setString(5, Obj.getDoctor());
           pst.setString(6, Obj.getDay());
           pst.setString(7, Obj.getInsurance());
           pst.setString(8, Obj.getTime());
           pst.setInt(9, Obj.getId());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Account created";
           }else{

               return "Not created";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}  
      //retrieving doctors in selected department
       public void depDoctors(Appoints Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            String sql ="SELECT doctor.name FROM doctor JOIN department ON doctor.dept_id = department.dept_id WHERE department.dep_name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,Obj.getDepartment());
            ResultSet rs = pst.executeQuery();
            List<String> doctorsList = new ArrayList<>();
            
            while(rs.next()){
                 String doctorName = rs.getString("name");
            doctorsList.add(doctorName);
                
                
            }
             Obj.setDoctors(doctorsList);

        con.close();
                       
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
        public User user(LogIn Obj){
            User user = null;
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            String sql ="SELECT id,fullnames,email,phone_number from users where email = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,Obj.getEmail());
            ResultSet rs = pst.executeQuery();
           
            
            while(rs.next()){
                int userId = rs.getInt("id");
                 String userName = rs.getString("fullnames");
                 String emailusr = rs.getString("email");
                 String phonenum = rs.getString("phone_number");
                 
                 user = new User(userId, userName, emailusr, phonenum);
         //   doctorsList.add(doctorName);
                
                
            }
             

        con.close();
                       
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return user;
    }
       public boolean authenticateDoctor(LogIn Obj) {
        try {
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            String query = "SELECT * FROM doctor WHERE email = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Obj.getEmail());
            pst.setString(2, Obj.getPassword());

            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
            // If a row exists, user is authenticated
            String retrievedEmail = resultSet.getString("email");
            Obj.setEmail(retrievedEmail); // Set the LogIn object's email with the retrieved email
            return true;
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
        public User doctor(LogIn Obj){
            User user = null;
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            String sql ="SELECT dept_id,email,password,name from doctor where email = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,Obj.getEmail());
            ResultSet rs = pst.executeQuery();
           
            
            while(rs.next()){
                int userId = rs.getInt("dept_id");
                 String userName = rs.getString("name");
                 String emailusr = rs.getString("email");
                 String phonenum = rs.getString("password");
                 
                 user = new User(userId, userName, emailusr, phonenum);
         //   doctorsList.add(doctorName);
                
                
            }
             

        con.close();
                       
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return user;
    }
        //appointments for doctor
          public List<Appoints> allAppointments(GetAppt obj){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, password);
           String sql="select fullnames,email,phone_number,day,insurance,time,patient_id from appointment where doctor = ?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,obj.getName());
           ResultSet result = pst.executeQuery();
           List<Appoints> appointmentList = new ArrayList<>();
           while(result.next()){
               Appoints Obj = new Appoints();
               Obj.setName(result.getString("fullnames"));
               Obj.setEmail(result.getString("email"));
               Obj.setPhone(result.getString("phone_number"));
               Obj.setDay(result.getString("day"));
               Obj.setInsurance(result.getString("insurance"));
               Obj.setTime(result.getString("time"));
               Obj.setId(result.getInt("patient_id"));
               appointmentList.add(Obj);
           }
           con.close();
           return appointmentList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
          //insert medical record
           public String recordmedical(MedicalRecs Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="insert into medical_report (patient_id,fullnames,diagnose,date,dob,sex,blood_type,prescription,doctor) values(?,?,?,?,?,?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setInt(1, Obj.getId());
           pst.setString(2, Obj.getName());
           pst.setString(3, Obj.getDiagnose());          
           pst.setString(4, Obj.getDate());
           pst.setString(5, Obj.getDob());
           pst.setString(6, Obj.getSex());
           pst.setString(7, Obj.getBlood());
           pst.setString(8, Obj.getPrescription());
           pst.setString(9, Obj.getDoctor());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Medical Report Created";
           }else{

               return "Not created";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}  
           //all appointments (admin)
            public List<Appoints> alltheAppointments(){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, password);
           String sql="select * from appointment";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet result = pst.executeQuery();
           List<Appoints> appointsList = new ArrayList<>();
           while(result.next()){
               Appoints Obj = new Appoints();
              Obj.setName(result.getString("fullnames"));
               Obj.setEmail(result.getString("email"));
               Obj.setPhone(result.getString("phone_number"));
               Obj.setDepartment(result.getString("department"));
               Obj.setDoctor(result.getString("doctor"));
               Obj.setDay(result.getString("day"));
               Obj.setStatus(result.getString("status"));
               Obj.setInsurance(result.getString("insurance"));
               Obj.setTime(result.getString("time"));
               Obj.setId(result.getInt("patient_id"));
               appointsList.add(Obj);
           }
           con.close();
           return appointsList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
            //delete appointment (admin)
     public String deleteappointment(Appoints Obj){
    try{
        Connection con = DriverManager.getConnection(dbUrl,username,password);
        String sql = "Delete from appointment where patient_id =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, Obj.getId());
        int rowsAffected = pst.executeUpdate();
        con.close();
        if(rowsAffected>=1){
            return "Appointment deleted succesfully";
        }else{
            return "Not delted, try again";
        }
    }
    catch(Exception ex){
        ex.printStackTrace();
        return "There was an error";
    }
}
     //count unanswered appointments
        public int countApts(){
        int count = 0;
            try{
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            String sql ="SELECT COUNT(*) AS aptCount from appointment where status IS Null";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            
            
            while(rs.next()){
                  count = rs.getInt("aptCount");               
            }
             

        con.close();
                       
        }catch(Exception ex){
            ex.printStackTrace();
        }
         return count;
    }  
//count all patients
          public int countPatient(){
        int count = 0;
            try{
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            String sql ="SELECT COUNT(*) AS patientCount from users";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            
            
            while(rs.next()){
                  count = rs.getInt("patientCount");               
            }
             

        con.close();
                       
        }catch(Exception ex){
            ex.printStackTrace();
        }
         return count;
    }  
          //count all doctors
           public int countDoctor(){
        int count = 0;
            try{
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            String sql ="SELECT COUNT(*) AS docCount from doctor";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            
            
            while(rs.next()){
                  count = rs.getInt("docCount");               
            }
             

        con.close();
                       
        }catch(Exception ex){
            ex.printStackTrace();
        }
         return count;
    }  
           //
        public List<MedicalRecs> prescribed(MedicalRecs patient) {
    try {
        Connection con = DriverManager.getConnection(dbUrl, username, password);
        String sql = "SELECT fullnames, diagnose, date, prescription, doctor,blood_type,sex,dob FROM medical_report WHERE patient_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, patient.getId());

        ResultSet result = pst.executeQuery();
        List<MedicalRecs> medicList = new ArrayList<>();

        while (result.next()) {
            MedicalRecs record = new MedicalRecs();
            record.setName(result.getString("fullnames"));
            record.setDiagnose(result.getString("diagnose"));
            record.setDate(result.getString("date"));
            record.setPrescription(result.getString("prescription"));
            record.setDoctor(result.getString("doctor"));
            record.setBlood(result.getString("blood_type"));
            record.setSex(result.getString("sex"));
            record.setDob(result.getString("dob"));

            medicList.add(record);
        }

        con.close();
        return medicList;
    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }
}
        public List<Appoints> allAppts(GetAppt obj) {
    String sql = "SELECT fullnames,doctor,day,status,time FROM appointment WHERE patient_id = ?";
    List<Appoints> appointmentList = new ArrayList<>();

    try (Connection con = DriverManager.getConnection(dbUrl, username, password);
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, obj.getId());
        ResultSet result = pst.executeQuery();

        while (result.next()) {
            Appoints appoints = new Appoints();
            appoints.setName(result.getString("fullnames"));

            appoints.setDoctor(result.getString("doctor"));
            appoints.setDay(result.getString("day"));
            appoints.setStatus(result.getString("status"));
            appoints.setTime(result.getString("time"));
            appointmentList.add(appoints);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        return null;
    }

    return appointmentList;
}
          //insert bill
          public String creatbill(Bill Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="insert into billing (patient_id,names,insurance,date,issued,amount) values(?,?,?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setInt(1, Obj.getId());
           pst.setString(2, Obj.getFullnames());
           pst.setString(3, Obj.getInsurance());
           pst.setString(4, Obj.getDate());
           pst.setString(5, Obj.getDoctor());
           pst.setDouble(6, Obj.getAmount());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Bill created";
           }else{

               return "Not created";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
          //All Bills
             public List<Bill> allBills(){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, password);
           String sql="select * from billing";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet result = pst.executeQuery();
           List<Bill> billList = new ArrayList<>();
           while(result.next()){
               Bill Obj = new Bill();
               Obj.setId(result.getInt("patient_id"));
               Obj.setFullnames(result.getString("names"));
               Obj.setInsurance(result.getString("insurance"));
               Obj.setDate(result.getString("date"));
               Obj.setDoctor(result.getString("issued"));
               Obj.setAmount(result.getDouble("amount"));
               billList.add(Obj);
           }
           con.close();
           return billList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
          //change password in settings
              public String updatepassword(Signup obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="update users set password=? where email=?";
           PreparedStatement pst = con.prepareStatement(sql);
          
          pst.setString(1, obj.getPassword());
           pst.setString(2, obj.getEmail());
          
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Password Succesfully Changed";
           }else{

               return "Not Changed";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
               public String status(Appoints Obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
           String sql ="update appointment set status=? where patient_id=?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, Obj.getStatus());
           pst.setInt(2, Obj.getId());
     ;
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){

               return "Reply Sent";
           }else{

               return "Not Sent";
           }
         }
        catch(Exception ex){
           ex.printStackTrace();
           return "Server Error!";
       }
}
        public  double calculateTotalRevenue(){
        double totalRevenue = 0;

            try{
                Connection con = DriverManager.getConnection(dbUrl,username,password);
            
            
                String sql ="SELECT amount FROM billing";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet resultSet = pst.executeQuery();
                while (resultSet.next()) {
                double amount = resultSet.getDouble("amount");
                totalRevenue += amount;
                 }
                
                
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return totalRevenue;
}
 /* public Login doctorauthenticate(LogIn Obj){
     try {
       Connection con = DriverManager.getConnection(dbUrl, username, password);
        String query = "SELECT * FROM doctor WHERE email = ? AND password = ?";
       PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, Obj.getEmail());
        pst.setString(2, Obj.getPassword());

        resultSet = pst.executeQuery();
        
        if (resultSet.next()) {
            LogIn Obj = new LogIn();
            Obj.setId(resultSet.getInt("id"));
            Obj.setEmail(resultSet.getString("email"));
            Obj.setName(resultSet.getString("name"));
            // Set other user properties as needed
            return Obj;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources (pst, con, resultSet) in a finally block
        // Handle exceptions here as needed
    }

    return null; // User authentication failed
}
  }*/
}



