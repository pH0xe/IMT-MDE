/**
 */
package imt.imtmde;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Arme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see imt.imtmde.ImtmdePackage#getTypeArme()
 * @model
 * @generated
 */
public enum TypeArme implements Enumerator {
	/**
	 * The '<em><b>FLEURET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEURET_VALUE
	 * @generated
	 * @ordered
	 */
	FLEURET(0, "FLEURET", "FLEURET"),

	/**
	 * The '<em><b>EPEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPEE_VALUE
	 * @generated
	 * @ordered
	 */
	EPEE(1, "EPEE", "EPEE"),

	/**
	 * The '<em><b>SABRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SABRE_VALUE
	 * @generated
	 * @ordered
	 */
	SABRE(2, "SABRE", "SABRE");

	/**
	 * The '<em><b>FLEURET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEURET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLEURET_VALUE = 0;

	/**
	 * The '<em><b>EPEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EPEE_VALUE = 1;

	/**
	 * The '<em><b>SABRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SABRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SABRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Arme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeArme[] VALUES_ARRAY = new TypeArme[] { FLEURET, EPEE, SABRE, };

	/**
	 * A public read-only list of all the '<em><b>Type Arme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeArme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Arme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeArme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeArme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Arme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeArme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeArme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Arme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeArme get(int value) {
		switch (value) {
		case FLEURET_VALUE:
			return FLEURET;
		case EPEE_VALUE:
			return EPEE;
		case SABRE_VALUE:
			return SABRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeArme(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TypeArme
