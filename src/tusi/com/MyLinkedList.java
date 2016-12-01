package tusi.com;

public class MyLinkedList {

    static Node nodeRoot;

    public MyLinkedList() {
        nodeRoot = new Node();
    }

    public void firstInsert(int newValue) {
        Node newEntry = new Node();
        newEntry.value = newValue;
        newEntry.nextValue = nodeRoot;
        nodeRoot = newEntry;
    }

    public void lastInsert(int newValue) {
        Node entry = nodeRoot;
        do {
            entry = entry.nextValue;
        } while (entry.nextValue != null);


        Node newEntry = new Node();
        entry.nextValue = newEntry;
        newEntry.value = newValue;
        newEntry.nextValue = null;

    }


    public void deleteFirst() {
        Node elem = nodeRoot;
        nodeRoot = elem.nextValue;
    }

    public void deleteLast() {
        Node elem = nodeRoot;
        if elem.nextValue != null {
            do {
                System.out.print(entry.value + ", ");
                entry = entry.nextValue;
            } while (entry.nextValue.nextValue != null);        	
        nodeRoot = elem.nextValue = null;
        } else {
        	elem.nextValue = null;
        }
    }

    public boolean deleteValue(int value) {
        Node entry = nodeRoot;
        Node lastEntry = nodeRoot;
        Node nextEntry = nodeRoot;
        boolean found = false;
        //ha az elsï¿½t kell tï¿½rï¿½lni, akkor vï¿½gig kell menni minden elemen
        if (entry.value == value) {
            found = true;
            do {
                entry.value = entry.nextValue.value;
                entry.nextValue = entry.nextValue.nextValue;
                entry = entry.nextValue;
            } while (entry.nextValue.nextValue != null);
        }

        //ha nem az elsï¿½, akkor elï¿½g ï¿½tï¿½rni egy helyen
        do {
            lastEntry = entry;
            if (entry.nextValue.value == value) {
                lastEntry.nextValue = entry.nextValue.nextValue;
                found = true;
            } else {
                entry = entry.nextValue;
            }
        } while ((entry.nextValue != null) && !(found));
        return found;
    }

    public void list() {
        Node entry = nodeRoot;
        do {
            System.out.print(entry.value + ", ");
            entry = entry.nextValue;
        } while (entry.nextValue != null);
        System.out.print(entry.value + ", ");
    }


    //	********************************************************************************************************
    public String show(int position) {
        int szamlalo = 0;
        String ertek = "Nincs ilyen pozï¿½ciï¿½";
        Node elem = nodeRoot;
        if (nodeRoot != null) {
            do {
                if (szamlalo == position) {
                    ertek = String.valueOf(elem.value);
                } else {
                    elem = elem.nextValue;
                }
                szamlalo++;
            } while ((elem.nextValue != null) && (szamlalo - 1 < position));
        }
        return ertek;
    }

    public String showLast () {
        Node elem = nodeRoot;
        if elem != null {
            do {
                System.out.print(entry.value + ", ");
                entry = entry.nextValue;
            } while (entry.nextValue != null);        	
        return String.valueOf(elem.value) ;
        } else {
        	return "Üres";
        }
    }

}


