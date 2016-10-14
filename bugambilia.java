
package bugambilia;

/**
 *
 * @author OTHONIEL
 */
public class bugambilia {
    String color;
    int tamaño_en_centimetros;
    String tipo;
    String caracteristicas;

    
    public bugambilia(){
        this.color="rosada";
        this.tamaño_en_centimetros= 500;
        this.tipo="original";
        this.caracteristicas="con muchas espinas";
    }

    public bugambilia(String color, int tamaño_en_centimetros, String tipo, String caracteristicas) {
        this.color = color;
        this.tamaño_en_centimetros = tamaño_en_centimetros;
        this.tipo = tipo;
        this.caracteristicas = caracteristicas;
    }
    public String getColor() {
        return color;
    }

    public int getTamaño_en_centimetros() {
        return tamaño_en_centimetros;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
     public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño_en_centimetros(int tamaño_en_centimetros) {
        this.tamaño_en_centimetros = tamaño_en_centimetros;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    } 
}
