public class BST {
	Nodo root;

    public Entrada Insertar(int turno ,String key, String value1, String value2) {
        if (root == null) {
            root = new Nodo();
            root.setEntrada(new Entrada(turno, key, value1, value2));
            return root.getEntrada();
        }
        Nodo node = root;
        Nodo newNode = new Nodo();
        newNode.setEntrada(new Entrada(turno, key, value1, value2));

        while (node != null) {
            int comp = key.compareTo(node.getEntrada().key);
            if (comp < 0) {
            /* This means the key we are looking for is smaller than entry.key
                so we should go to the left side of this node, where entry.key is smaller
                and hence we have a better chance of finding a match
            */
                if (node.left == null) {
                    node.left = newNode;
                    newNode.padre = node;
                    return newNode.getEntrada();
                } else {
                    node = node.left;
                }
            } else if (comp > 0) {

                if (node.right == null) {

                    node.right = newNode;
                    newNode.padre = node;
                    return newNode.getEntrada();
                } else {
                    node = node.right;
                }

            } else {
            /*If an exact match is found go to the left tree to re enter this key*/
                node = node.left;

            }

        }
        return null;

    }
    
    public String Find_english(String key) {
        Nodo node = root;
        while (node != null) {
            int comp = key.compareToIgnoreCase(node.getEntrada().key);
            if (comp < 0) {             /*             This means the key we are looking for is smaller than entry.key             so we should go to the left side of this node, where entry.key is smaller             and hence we have a better chance of finding a match             */
                node = node.left;
            } else if (comp > 0) {
                node = node.right;
            } else {
            /*The keys are equal!
             Hence return the node's entry*/
                return node.visit_english(key);
            }

        }
        return "*" + key + "*";

    }
    
    public String Find_spanish(String key) {
        Nodo node = root;
        while (node != null) {
            int comp = key.compareToIgnoreCase(node.getEntrada().key);
            if (comp < 0) {             /*             This means the key we are looking for is smaller than entry.key             so we should go to the left side of this node, where entry.key is smaller             and hence we have a better chance of finding a match             */
                node = node.left;
            } else if (comp > 0) {
                node = node.right;
            } else {
            /*The keys are equal!
             Hence return the node's entry*/
                return node.visit_spanish(key);
            }

        }
        return "*" + key + "*";

    }
    
    public String Find_french(String key) {
        Nodo node = root;
        while (node != null) {
            int comp = key.compareToIgnoreCase((String )node.getEntrada().key);
            if (comp < 0) {           
                node = node.left;
            } else if (comp > 0) {
                node = node.right;
            } else {

                return node.visit_french(key);
            }

        }
        return "*" + key + "*";

    }



    public void ImprimirOrdenado() {
        root.inorder();
    }
}
