package javaapplication9;

public class JavaApplication9 {
    public static void main(String[] args) {
        try{
            GetSet obj = new GetSet();
            obj.setManagerName("Suneel Monapati");
            obj.setTeamLeadName("Narendra jha");
            obj.getSetCollik.setCollikOne("Vamsi");
            obj.getSetCollik.setCollikTwo("veerabhadra");
            obj.getSetCollik.setCollikThree("Nidhi");
            obj.getSetCollik.setCollikFour("Jaswanth");
            obj.getSetCollik.setCollikFive("M K Harinarayanan");
            System.out.println("My team has");
            System.out.println("Manager "+obj.getManagerName());
            System.out.println("Tech Lead "+obj.getTeamLeadName());
            System.out.println("and Following colliks"+"\n"
                    +obj.getSetCollik.getCollikOne()+  "\n "
                    +obj.getSetCollik.getCollikTwo()+  "\n "
                    +obj.getSetCollik.getCollikThree()+"\n "
                    +obj.getSetCollik.getCollikFour()+ "\n"
                    +obj.getSetCollik.getCollikFive());
        }catch(NullPointerException e){
            System.out.println(e);
        }

    }
}


//i wantprint my manager name , team lead and colliks