package tusi.com;



/*
 * Irj meg egy Sor azaz Queue implementaciot, aminek a lenyege, hogy FIFO sorrendben adja vissza a belerakott elemeket. Pelda:
 * offer (1), offer(2), offer(3) utan a poll() -> 1, poll() -> 2, poll() -> 3 ertekeket ad vissza. Azaz pont ellenkezoleg mukodik,
 * mint a stack.
 *
 * Ha ures a queue, akkor a poll es a peek is null-t adjon vissza egyelore.
 *
 * Tanacs: hasznos lehet a lastDelete ill. a getLast() metodusok lefejlesztese a lancolt listadhoz.
 *
 */
public class MyQueue {

    private MyLinkedList linkedList = new MyLinkedList();

    // Hozzaad a queue-hoz egy uj elemet
    public void offer(int value) {
    	linkedList.myFirstInsert(value);
    }

    // Kiveszi a queue elso elemet es torli a queue-rol
    public Integer poll() {
        linkedList.showLast();
    	linkedList.deleteLast();
    	return null;
    }

    // Kiveszi a queue elso elemet, DE NEM TORLI! Ha ujra hivom, megint visszaadja.
    public Integer peek() {
        return null;
    }
}
