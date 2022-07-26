class Solution {
    public String predictPartyVictory(String senate) {
        char[] letters=senate.toCharArray();
        int Rs=0, Ds=0, skipR=0, skipD=0;
        for(int i=0; i<letters.length; i++){
            if(letters[i]=='R')
                Rs++;
            else
                Ds++;
        }
        while(true){
                for(int i=0; i<letters.length; i++){
                if(letters[i]=='R'){
                    if(skipR>0){
                        skipR--;
                        letters[i]=' ';
                    }
                    else if(Rs>0 && Ds==0)
                        return "Radiant";
                    else{
                        Ds--;
                        skipD++;
                    }
                }
                else if(letters[i]=='D'){
                    if(skipD>0){
                        skipD--;
                        letters[i]=' ';
                    }
                    else if(Ds>0 && Rs==0)
                        return "Dire";
                    else{
                        Rs--;
                        skipR++;
                    }
                }
            }
        }
    }
}