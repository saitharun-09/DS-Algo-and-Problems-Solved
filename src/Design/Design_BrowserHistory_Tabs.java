package Design;

class Node{
    String page;
    Node next;
    Node prev;

    Node(String page,Node next,Node prev) {
        this.page = page;
        this.next = next;
        this.prev = prev;
    }

    Node(String page){
        this.page = page;
        this.next = null;
        this.prev = null;
    }
}

public class Design_BrowserHistory_Tabs {
    static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("google.com");
        System.out.println("Inside new goolge.com");
        browser.visit("f1.com");
        System.out.println("Visited f1.com");
        String f = browser.forward(2);
        System.out.println("Forwarded to " + f);
    }
}

class BrowserHistory {

    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    public void visit(String url) {
        curr.next = null;
        Node node = new Node(url);
        node.prev = curr;
        curr.next = node;
        curr = curr.next;
    }

    public String back(int steps) {
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }
        return curr.page;
    }

    public String forward(int steps) {
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }
        return curr.page;
    }
}
