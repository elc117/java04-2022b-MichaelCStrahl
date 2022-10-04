import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    // COMPLETE-ME
    // Construa um ArrayList<String> contendo informações de contato (ContactInfo)
    // de cada um dos estudantes e professores
    ArrayList<String> contactInfo = new ArrayList<String>();

    for (int i = 0 ; i < this.professors.size() + this.students.size(); i++) {
      int countStudents = this.students.size();
      int countProfessors = this.professors.size();

      while(countStudents > 0) {
        contactInfo.add(this.students.get(countStudents - 1).getContactInfo());
        countStudents--;
      }

      while(countProfessors > 0) {
        contactInfo.add(this.professors.get(countProfessors - 1).getContactInfo());
        countProfessors--;
      }
    }

    return contactInfo;

  }

  public boolean userExists(String userId) {
    // COMPLETE-ME
    // Verifique se existe o userId na lista de estudantes ou de professores
    
    if (this.professors.get(0).getUserId() == userId) {
      return true;
    } else {
      return false;
    }
  }

  public int countMembers() {
    // COMPLETE-ME
    // Retorne o total de membros do laboratório (estudantes e professores)
    return this.professors.size() + this.students.size();
  }


}