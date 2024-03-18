public class Valor {

    public static Valor VOID = new Valor(new Object());

    final Object valor;

    public Valor(Object value) {
        this.valor = value;
    }

    public Boolean asBoolean() {
        return (Boolean)valor;
    }

    public Float asFloat() {
        return (Float)valor;
    }

    public String asString() {
        return String.valueOf(valor);
    }

    public boolean isFloat() {
        return valor instanceof Float;
    }

    @Override
    public int hashCode() {

        if(valor == null) {
            return 0;
        }

        return this.valor.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(valor == o) {
            return true;
        }

        if(valor == null || o == null || o.getClass() != valor.getClass()) {
            return false;
        }

         Valor that = (Valor)o;

        return this.valor.equals(that.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}