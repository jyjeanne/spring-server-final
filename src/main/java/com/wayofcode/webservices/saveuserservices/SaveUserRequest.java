//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.03.31 à 12:05:04 AM CEST 
//


package com.wayofcode.webservices.saveuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.blog.wayofcode.user.User;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userDetails" type="{http://user.wayofcode.blog.com}User"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userDetails"
})
@XmlRootElement(name = "SaveUserRequest")
public class SaveUserRequest {

    @XmlElement(required = true)
    protected User userDetails;

    /**
     * Obtient la valeur de la propriété userDetails.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserDetails() {
        return userDetails;
    }

    /**
     * Définit la valeur de la propriété userDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserDetails(User value) {
        this.userDetails = value;
    }

}
