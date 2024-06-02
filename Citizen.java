import javax.lang.model.util.ElementScanner6;

public class Citizen {
    private String fullName;
    private int age;
    private String gender;
    private float grossIncome;

    public String getFullName() {
        return fullName;
    }

    public int grtAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public float getGrossIncome() {
        return grossIncome;
    }
     
    public void setFullName(String fn) {
        fullName = fn;
    }

    public void setAge(int a) {
        if (a >= 110) {
            a =110;
        }
        age = Math.abs(a);
    } 

    public void setGender(String gd) {
        if (gd == "Female") {   
            gd ="Female";
        }else if (gd == "Male") {
           gd = "Male";
        }else { 
           gd = "Others";
        }
        gender = gd;
    }

    public void setGrossIncome(float gi) {
        if (gi < 0) {
            gi = 0;
        }
        grossIncome = gi;
    }
}