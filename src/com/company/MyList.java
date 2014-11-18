package com.company;

/**
 * Created by root on 17.11.14.
 */
public class MyList<E> implements List<E>{

    private class ListItem{
        public E item;;
        public ListItem next;
        public ListItem previous;
        ListItem(E i, ListItem n, ListItem p){
            item = i;
            next = n;
            previous = p;
        }
    }

    private ListItem head;
    private ListItem cur;

    MyList(){
        head = null;
    }

    public void add(E item){
        if (head==null){
            head = new ListItem(item, null, null);
        }
        else {
            for (cur=head; cur!=null; cur=cur.next){}
/*            cur = head;
            while (cur.next!=null){
                cur = cur.next;
            }*/
            cur.next = new ListItem(item, null, cur);
        }
    }

    public int size(){
        int n = 0;
        for (cur=head; cur!=null; cur=cur.next){ n++; }

/*        cur = head;
        while (cur!=null){
            cur = cur.next;
            n++;
        }*/
        return n;
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public void delete() throws Exception{
        if (head==null){
            throw new Exception("DeleteFromEmptyList");
        }
        else {
            for (cur=head; cur!=null; cur=cur.next){}
/*            cur = head;
            while (cur.next!=null){
                cur = cur.next;
            }*/
            cur.next = null;
        }
    }

    public boolean contains(E key){
        cur = head;
        for (cur=head; cur!=null; cur=cur.next){
            if (cur.item.equals(key)){
                return true;
            }
        }
        return false;
    }

}
