package list;

/**
 * @auther luyu
 */
public class MyLinkedList {
    public int val;
    public MyLinkedList next;
    public MyLinkedList(int val,MyLinkedList next){
        this.val = val;
        this.next = next;
    }
    public MyLinkedList() {
//        设置虚拟头结点
        new MyLinkedList(-2,null);
    }

    public int get(int index) {
        int start = 0;
        MyLinkedList pre = this;
        while(pre.next!=null){
            if(start==index){
                return pre.next.val;
            }
            pre = pre.next;
            start++;
        }
        return -3;
    }

    public void addAtHead(int val) {
        MyLinkedList oldHead = this.next;
        MyLinkedList newHead = new MyLinkedList(val,oldHead);
        this.next = newHead;
    }

    public void addAtTail(int val) {
        MyLinkedList cur = this.next;
        while(cur.next!=null){
            cur = cur.next;
        }
        MyLinkedList tail = new MyLinkedList(val,null);
        cur.next=tail;
    }

    public void addAtIndex(int index, int val) {
        int start = 0;
        if(index<0){
            addAtHead(val);
        }
        MyLinkedList pre = this;
        if(pre.next==null){
            addAtHead(val);
            return;
        }
        while(pre.next!=null){
            if(start==index){
                MyLinkedList newVal = new MyLinkedList(val,pre.next);
                pre.next = newVal;
                break;
            }
            start++;
            pre=pre.next;
        }
    }

    public void deleteAtIndex(int index) {
        int start = 0;
        MyLinkedList cur = this.next;
        MyLinkedList pre = this;
        if(index<0){
            return;
        }
        while(cur!=null){
            if(index==0){
                pre.next = cur.next;
                break;
            }
            if(start==index){
                pre.next = cur.next;
                break;
            }
            pre=cur;
            cur = cur.next;
            start++;
        }
    }
}
