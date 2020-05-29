import java.util.ArrayList;

public class SubstitutionAlgorythm {
    // алгоритм второй шанс
    ArrayList<Record> Table;
    PhysicalMemory physicalMemory;

    public SubstitutionAlgorythm(ArrayList<Record> Table, PhysicalMemory physicalMemory) {
        this.Table = Table;
        this.physicalMemory = physicalMemory;
    }
    public void start() {
        for(int i = 0; i< Table.size(); i++) {
            int number = Table.get(i).getNumberOfPhysicalPage();
            if(Table.get(i).r() == false && Table.get(i).isInPhysicalMemory()) {
                System.out.println("Страница № " + Table.get(i).getPageNumber() + "выгружена на диск," + " так как признак обращения сброшен");
                physicalMemory.sendPageToDisk(number);
                Table.get(i).removeFromPhysicalMemory();
                Table.get(i).setNumberOfPhysicalPage(-1);
                break;
            }
            else {
                Table.get(i).r(false);
                Table.add(Table.get(i));
                Table.remove(i);
                System.out.println("Страница № " + Table.get(i).getPageNumber() + "перемещена в конец очереди, признак обращения сброшен");
            }


        }
    }
}