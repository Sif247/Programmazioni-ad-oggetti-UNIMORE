import java.util.Arrays;

public class EnhancedResizableArray {
    public static final int DEFAULT_CAPACITY = 4;
    int[] v;

    public EnhancedResizableArray()
    {
        this.v = new int[DEFAULT_CAPACITY];
    }
    public int get(int index)
    {
        return v[index];
    }

    public void set(int index, int value)
    {
        if (index >= v.length) {
            int[] tmp = new int[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(int value) {
        for (int i : v) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public void fill(int value)
    {
        for(int i = 0; i < v.length ;i++)
        {
            v[i] = value;
        }
    }

    public int[] toArray()
    {
        return Arrays.copyOf(v,v.length);
    }

    public int lenght()
    {
        return v.length;
    }
}
