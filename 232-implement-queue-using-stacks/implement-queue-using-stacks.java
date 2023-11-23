class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> sec;

    public MyQueue() {
        first = new Stack<>();
        sec = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (sec.isEmpty()) {
            while (!first.isEmpty()) {
                sec.push(first.pop());
            }
        }
        return sec.pop();
    }

    public int peek() {
        if (sec.isEmpty()) {
            while (!first.isEmpty()) {
                sec.push(first.pop());
            }
        }
        return sec.peek();
    }

    public boolean empty() {
        return first.isEmpty() && sec.isEmpty();
    }
}
