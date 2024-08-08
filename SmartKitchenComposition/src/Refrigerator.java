public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        System.out.println("Refrigerator -> ordering food");
    }
}
