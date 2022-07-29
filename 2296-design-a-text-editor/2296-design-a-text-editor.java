class TextEditor {
    StringBuilder s;
    int cur;
    
    public TextEditor() {
        this.s=new StringBuilder();
        this.cur=-1;
    }
    
    public void addText(String text) {
        s.insert(cur+1,text);
        cur+=text.length();
    }
    
    public int deleteText(int k) {
        if(cur-k>-1){
            s.delete(cur-k+1,cur+1);
            cur-=k;
            return k;
        }
        else{
            s.delete(0,cur+1);
            int x=cur+1;
            cur=-1;
            return x;
        }
    }
    
    public String cursorLeft(int k) {
        if(cur-k>-1){
            cur-=k;
        }
        else{
            cur=-1;
            return "";
        }
        return s.substring(Math.max(0,cur-9),cur+1);
    }
    
    public String cursorRight(int k) {
        if(cur+k>s.length()-1){
            cur=s.length()-1;
        }
        else{
            cur=cur+k;
        }
        return s.substring(Math.max(0,cur-9),cur+1);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */