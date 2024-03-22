public class Valor {

    public static Valor VOID = new Valor(new Object());

    final Object value;

    public Valor(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Float asFloat() {
        return (Float)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isFloat() {
        return value instanceof Float;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Valor that = (Valor)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}