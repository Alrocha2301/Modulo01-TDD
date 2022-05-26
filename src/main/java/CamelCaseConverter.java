public class CamelCaseConverter {
    public String converter(String nome) {

        StringBuilder nomeCamelCase = new StringBuilder(nome.substring(0, 1).toUpperCase());
        for (int i = 1; i < nome.length(); i++) {
            String letra = String.valueOf(nome.charAt(i));
            if (letra.contentEquals(" ")) {
                nomeCamelCase.append(" ").append(nome.substring(i + 1, i + 2).toUpperCase());
                i++;
            } else {
                nomeCamelCase.append(nome.substring(i, i + 1).toLowerCase());
            }
        }
        return nomeCamelCase.toString();
    }
}
