package control;

import model.idol.Idol;

import java.util.ArrayList;
import java.util.List;

public class IdolManager implements IGeneralManager<Idol> {

    private List<Idol> idolList = new ArrayList<>();

    @Override
    public List findAll() {
        return idolList;
    }

    @Override
    public void saveList(Idol idol) {
        idolList.add(idol);
    }

    @Override
    public void removeByIndex(int index) {
        idolList.remove(index);
    }

    @Override
    public void updateByIndex(int index, Idol idol) {
        idolList.set(index, idol);
    }

    @Override
    public Idol searchById(String id) {
        Idol idol = null;
        for (int i = 0; i < idolList.size(); i++) {
            if (idolList.get(i).getId().equals(id)) {
                idol  = idolList.get(i);
                break;
            }
        }
        return idol;
    }

    @Override
    public Idol searchByName(String name) {
        Idol idol = null;
        for (int i = 0; i < idolList.size(); i++) {
            if (idolList.get(i).getStageName().equals(name)) {
                idol  = idolList.get(i);
                break;
            }
        }
        return idol;
    }

    @Override
    public void showAllList() {
        for (Idol idol: idolList
             ) {
            System.out.println(idol);
        }
    }
}
