package examenII.examenII;

public class Person {

  private String name, surname, adress, sexo;
  private Integer age;

  public Person(String name, String surname, String sexo, String adress, Integer age) {
    this.name = name;
    this.surname = surname;
    this.adress = adress;
    this.age = age;
    this.sexo = sexo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return (
      "Person [name=" +
      name +
      ", surname=" +
      surname +
      ", adress=" +
      adress +
      ", age=" +
      age +
      "]"
    );
  }
}

