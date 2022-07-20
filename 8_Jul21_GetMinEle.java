class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer>stack = new Stack<>();
        for(int i=0; i<n; i++){
            stack.push(arr[i]);
        }
        return stack;
    }
    
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer in:s){
            pq.add(in);
        }
        while(!s.isEmpty()){
            int min = pq.peek();
            System.out.print(min+ " ");
            pq.remove(s.pop());
        }
        pq.clear();
        pq = null;
        assert(s.isEmpty());
    }
}
