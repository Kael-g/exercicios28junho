package openClosed;

public class Main {

    public static void main(String[] args) {
        Recipiente caixaDagua = new CaixaDaguaCilindrica(450, 200);
        Torneira torneira = new Torneira();
        torneira.encherRecipiente(caixaDagua);
    }
}
