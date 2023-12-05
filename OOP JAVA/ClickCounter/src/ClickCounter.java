public class ClickCounter {
    int value;

    public int getValue() {
        return value;
    }

    void click()
    {
        value++;
        System.out.println("aggiunto un click");
    }

    void undo()
    {
        if(value > 0)
        {
            value--;
        }
        System.out.println("tolto un valore");
    }

    void reset()
    {
        value = 0;
    }

}
