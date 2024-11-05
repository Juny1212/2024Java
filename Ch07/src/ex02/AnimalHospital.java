package ex02;

public class AnimalHospital {

    public void CheckPatient(Animal animal) {
        if(animal.IsHealthy())
            System.out.println("건강합니다.");
        else
            System.out.println("치료가 필요합니다.");
    }

}
