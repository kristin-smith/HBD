class mirrorBirthday {
    public static void main(String args[] ) throws Exception {
        String orig = "!yadhtriB yppaH";
        char origArray[] = orig.toCharArray();
        int len = orig.length();
        char newString[] = new char[len];
        for (int i=0;i<len;i++) {
            char letter= origArray[i];
            int newPos = len-i-1;
            newString[newPos]=letter;
        }
        System.out.println(newString);
    }
}
