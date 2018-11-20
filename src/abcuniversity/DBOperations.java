/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abcuniversity;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DBOperations {

    String url = "jdbc:mysql://localhost:3306/abcuniversity";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean addStudent(Student em) {
        try {
            System.out.println("Add student 1");
            con = DriverManager.getConnection(url, username, password);
             String query = "INSERT INTO studentdetails VALUES(?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Add student 2");
            pst.setInt(1, em.getRegID());
            pst.setString(2, em.getFirstName());
            pst.setString(3, em.getLastName());
            pst.setInt(4, em.getAge());
            pst.setString(5, em.getAddress());
            pst.setString(6, em.getGender());
            pst.setString(7, em.getFaculty());
            pst.setString(8, em.getDepartment());
            pst.setInt(9, em.getYearOfRegistration());
            System.out.println("Add student 3");
            pst.executeUpdate();
            System.out.println("Add student 4");
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    ArrayList<Student> getStudent() {
        try {
            ArrayList<Student> list = new ArrayList<Student>();


            System.out.println("get student 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM studentdetails";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("get student 2");

            rs = pst.executeQuery();
            System.out.println("get student 3");
            while (rs.next()) {
                Student s = new Student();
                s.setRegID(rs.getInt(1));
                s.setFirstName(rs.getString(2));
                s.setLastName(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setAddress(rs.getString(5));
                s.setGender(rs.getString(6));
                s.setFaculty(rs.getString(7));
                s.setDepartment(rs.getString(8));
                s.setYearOfRegistration(rs.getInt(9));
                list.add(s);
            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    ArrayList<Lecturer> getLecturer() {
        try {
            ArrayList<Lecturer> list = new ArrayList<Lecturer>();


            System.out.println("get Lecturer 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM lecturerdetails";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("get Lecturer 2");

            rs = pst.executeQuery();
            System.out.println("get Lecturer 3");
            while (rs.next()) {
                Lecturer s = new Lecturer();
                s.setLecturerID(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setAddress(rs.getString(4));
                s.setGender(rs.getString(5));
                s.setFaculty(rs.getString(6));
                list.add(s);
            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    ArrayList<DegreePrograms> getDegree() {
        try {
            ArrayList<DegreePrograms> list = new ArrayList<DegreePrograms>();


            System.out.println("get DegreePrograms 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM degreedetails";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("get DegreePrograms 2");

            rs = pst.executeQuery();
            System.out.println("get DegreePrograms 3");
            while (rs.next()) {
                DegreePrograms s = new DegreePrograms();
                s.setDegreeId(rs.getInt(1));
                s.setDegreeName(rs.getString(2));
                s.setDuration(rs.getString(3));
                list.add(s);
            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean UpdateStudent(Student em) {
        try {
            System.out.println("update student 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "UPDATE studentdetails SET firstName='" + em.getFirstName() + "',lastName='" + em.getLastName() + "',age=" + em.getAge() + ",address='" + em.getAddress() + "',gender='" + em.getGender() + "',faculty='" + em.getFaculty() + "',department='" + em.getDepartment() + "',yearOfRegistration=" + em.getYearOfRegistration() + " WHERE regID=" + em.getRegID();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update student 2");

            pst.executeUpdate();
            System.out.println("update student 3");
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }

    }

    public boolean UpdateLecturer(Lecturer em) {
        try {
            System.out.println("update Lecturer 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "UPDATE lecturerdetails SET Name='" + em.getName() + "',age=" + em.getAge() + ",address='" + em.getAddress() + "',gender='" + em.getGender() + "',faculty='" + em.getFaculty() + "' WHERE lecturerID=" + em.getLecturerID();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update Lecturer 2");

            pst.executeUpdate();
            System.out.println("update Lecturer 3");
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean deleteStudent(Student em) {
        try {
            System.out.println("Delete student 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM studentdetails WHERE regID=" + em.getRegID();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Delete student 2");

            pst.executeUpdate(query);
            System.out.println("Delete student 3");
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean deleteLecturer(Lecturer em) {
        try {
            System.out.println("Delete Lecturer 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM lecturerdetails WHERE lecturerID=" + em.getLecturerID();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Delete Lecturer 2");

            pst.executeUpdate(query);
            System.out.println("Delete Lecturer 3");
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean addLecturer(Lecturer em) {
        try {
            System.out.println("Add lecturer 1");
            con = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO lecturerdetails VALUES(?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Add lecturer 2");
            pst.setInt(1, em.getLecturerID());
            pst.setString(2, em.getName());
            pst.setInt(3, em.getAge());
            pst.setString(4, em.getAddress());
            pst.setString(5, em.getGender());
            pst.setString(6, em.getFaculty());
            System.out.println("Add lecturer 3");
            pst.executeUpdate();
            System.out.println("Add lecturer 4");
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
}
