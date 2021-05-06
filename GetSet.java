package javaapplication9;

public class GetSet {
    private String managerName = null;
    private String teamLeadName = null;
    private String collikName = null;
    
    GetSetColliks getSetCollik;

    public GetSet(){
        getSetCollik = new GetSetColliks();
    }
    

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getTeamLeadName() {
        return teamLeadName;
    }

    public void setTeamLeadName(String teamLeadName) {
        this.teamLeadName = teamLeadName;
    }

    public String getCollikName() {
        return collikName;
    }

    public void setCollikName(String collikName) {
        this.collikName = collikName;
    }
    
    
    
}
