class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        int sandwichPointer = 0, unservedCount = 0;

        for (int student : students) studentQueue.add(student);

        while (!studentQueue.isEmpty() && unservedCount != studentQueue.size()) {
            if (studentQueue.peek() == sandwiches[sandwichPointer]) {
                unservedCount = 0;
                sandwichPointer++;
                studentQueue.poll();
            } else {
                studentQueue.add(studentQueue.poll());
                unservedCount++;
            }
        }
        return studentQueue.size();
    }
}
