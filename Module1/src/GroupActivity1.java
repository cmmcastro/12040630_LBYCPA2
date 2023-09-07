public class GroupActivity1 {
    public static String center(String text, int len){

        int textLength = text.length();
        int halfText = (textLength/2);
        int start = (len/2)-halfText;
        int end = len-start-textLength;
        String centeredText = "";

        if (len % 2 != 0 && textLength % 2 == 0){
            start += 1;
            end -= 1;
        }

        for (int i = 0; i < start; i++){
            centeredText += " ";
        }

        centeredText += text;

        for (int j = 0; j < end; j++){
            centeredText += " ";
        }

        return centeredText; 
    }

    public static String printBorder(char symbol, int len){
        String border = "";

        for (int i = 0; i < len; i++){
            border += symbol;
        }

        return border;
    }

    public static void main(String[] args) {
        int col1 = 8, col2 = 8, col3 = 8, col4 = 6, col5 = 6, col6 = 7, col7 = 6, col8 = 9;
        String tableBorder = (" "+printBorder('-', col1)+" "+printBorder('-', col2)+" "+printBorder('-', col3)+" "+printBorder('-', col4)+" "+printBorder('-', col5)+" "+printBorder('-', col6)+" "+printBorder('-', col7)+" "+printBorder('-', col8));

        System.out.println(tableBorder+"\n|"+center(" ", col1)+"|"+center("1", col2)+"|"+center("1", col3)+"|"+center("1", col4)+"|"+center("1", col5)+"|"+center("1", col6)+"|"+center("1", col7)+"|"+center("1", col8)+"|");
        System.out.println("|"+center(" ", col1)+"|"+center("SECOND", col2)+"|"+center("MINUTE", col3)+"|"+center("HOUR", col4)+"|"+center("DAY", col5)+"|"+center("MONTH", col6)+"|"+center("YEAR", col7)+"|"+center("CENTURY", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("lg n", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("\u221An", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("n", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("n lg n", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("n^2", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("n^3", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("2^n", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|");
        System.out.println(tableBorder+"\n|"+center("n!", col1)+"|"+center("NULL", col2)+"|"+center("NULL", col3)+"|"+center("NULL", col4)+"|"+center("NULL", col5)+"|"+center("NULL", col6)+"|"+center("NULL", col7)+"|"+center("NULL", col8)+"|\n"+tableBorder );
    }
}
