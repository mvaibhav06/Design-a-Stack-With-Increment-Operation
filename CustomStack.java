class CustomStack {

    private int[] temp;
    private int top;

    public CustomStack(int maxSize) {
        this.temp = new int[maxSize];
        for(int i=0; i<maxSize; i++){
            temp[i] = -1;
        }
        this.top = -1;
    }
    
    public void push(int x) {
        if(top != temp.length-1){
            temp[++top] = x;
        }
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        int out = temp[top];
        temp[top--] = -1;
        return out;
    }
    
    public void increment(int k, int val) {
        int len = k;
        if(k > temp.length){
            len = temp.length;
        }
        for(int i=0; i<len; i++){
            temp[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
