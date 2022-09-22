import java.util.*;

public class Library{
    private List<Member> memberList=new ArrayList<Member>();
    public void setMemberList(List<Member> lisT){
        memberList=lisT;
    }
    public List<Member> getMemberList(){
        return memberList;
    }
    public void addMember(Member memberObj){
        memberList.add(memberObj);
    }
    public List<Member> viewAllMembers(){
        return memberList;
    }
    public List<Member> viewMembersByAddress(String address){
        List<Member> lisst=new ArrayList<Member>();
        for(Member obj:memberList){
            if(obj.getAddress().equalsIgnoreCase(address)){
                lisst.add(obj);
            }
        }
        return lisst;
    }
}