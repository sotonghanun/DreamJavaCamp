package dreamschool.cscourse.workshop02;

public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int    price;
    private String issueDate;
    
    public Book( String title, String author ) {
        this.title  = title;
        this.author = author;
    }
    
    public Book( String isbn, String title, String author, int price ) {
        //TODO ������ ���� �ۼ�
    }
    
    public Book( String isbn, String title, String author, int price, String issueDate ) {
        //TODO ������ ���� �ۼ�
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void printBookInfo() {
        
        System.out.print( "[����] " + title + "\t[����] " + author );
        
        if ( price > 0 ) {
            System.out.print( "\t[����] " + price );
        }
        
        if ( issueDate != null ) {
            System.out.print( "\t[������] " );
            printDate( issueDate );
        }
        
        System.out.println();
    }
    
    private void printDate( String date ) {
        //TODO YYYY-MM-DD �������� ����Ǿ� �ִ� ��¥ ������ YYYY�� MM�� DD�� �������� �����Ͽ� ����Ͻÿ�.
        
    }
}