public class Person {
    private String Cname, Ename, Department, Email, Phone, Address, Id;
    private Short Sex;
    private int Height, Weight;
    public Person(String cname1, String ename1, String department1, String email1, String phone1, String address1, String id1, Short sex1, int height1, int weight1){
        this.setCname(cname1);
        this.setEname(ename1);
        this.setDepartment(department1);
        this.setPhone(phone1);
        this.setEmail(email1);
        this.setAddress(address1);
        this.setId(id1);
        this.setSex(sex1);
        this.setHeight(height1);
        this.setWeight(weight1);
    }
    public String getCname() {
        return Cname; }

    public String getEname() {
        return Ename; }

    public String getDepartment() {
        return Department; }

    public String getEmail() {
        return Email; }

    public String getPhone() {
        return Phone; }

    public String getAddress() {
        return Address; }

    public String getId() {
        return Id; }

    public Short getSex() {
        return Sex; }

    public int getHeight() {
        return Height; }

    public int getWeight() {
        return Weight; }

    public void setCname(String cname1){
        if(cname1.length()<30){
            this.Cname=cname1;
        }else {
            System.out.println("長度不能超過30");
            this.Cname="錯誤";
        }
    }

    public void setEname(String ename1){
        if(ename1.length()<10){
            this.Ename=ename1;
        }else {
            System.out.println("長度不能超過10");
            this.Ename="錯誤";
        }
    }

    public void setDepartment(String department1){
        this.Department=department1; }

    public void setEmail (String email1){
        this.Email=email1; }

    public void setPhone(String phone1){
        if(phone1.matches("[0-9]{10}")){
            this.Phone=phone1;
        }else {
            System.out.println("電話長度不能超過10碼");
            this.Phone="錯誤";
        }
    }

    public void setAddress(String address1){
        this.Address=address1; }

    public void setId(String id1){
        if(id1.matches("[0-9]{9}")){
            this.Id=id1;
        }else {
            System.out.println("錯誤");
            this.Id="錯誤";
        }
    }

    public void setSex(Short sex1){
        if(sex1>=0 && sex1<=3){
            this.Sex=sex1;
        }else{
            System.out.println("性別錯誤 設定為0");
            this.Sex=87;
        }
    }

    public void setHeight(int height1) {
        if(height1<250){
            this.Height=height1;
        }else {
            System.out.println("身高錯誤 設定為0");
            this.Weight=0;
        }
    }

    public void setWeight(int weight1) {
        if(weight1>0 && weight1<350){
            this.Weight=weight1;
        }else {
            System.out.println("體重不可能太高 設定為0");
            this.Weight=0;
        }
    }
}