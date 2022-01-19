/**
 */
package imt.imtmde;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Sexe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see imt.imtmde.ImtmdePackage#getTypeSexe()
 * @model
 * @generated
 */
public enum TypeSexe implements Enumerator {
	/**
	 * The '<em><b>FEMME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMME_VALUE
	 * @generated
	 * @ordered
	 */
	FEMME(0, "FEMME", "FEMME"),

	/**
	 * The '<em><b>HOMME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMME_VALUE
	 * @generated
	 * @ordered
	 */
	HOMME(1, "HOMME", "HOMME"),

	/**
	 * The '<em><b>MIXTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXTE_VALUE
	 * @generated
	 * @ordered
	 */
	MIXTE(2, "MIXTE", "MIXTE");

	/**
	 * The '<em><b>FEMME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEMME_VALUE = 0;

	/**
	 * The '<em><b>HOMME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOMME_VALUE = 1;

	/**
	 * The '<em><b>MIXTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIXTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Sexe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeSexe[] VALUES_ARRAY = new TypeSexe[] { FEMME, HOMME, MIXTE, };

	/**
	 * A public read-only list of all the '<em><b>Type Sexe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeSexe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Sexe</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSexe get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSexe result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Sexe</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSexe getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSexe result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Sexe</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSexe get(int value) {
		switch (value) {
		case FEMME_VALUE:
			return FEMME;
		case HOMME_VALUE:
			return HOMME;
		case MIXTE_VALUE:
			return MIXTE;
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
	private TypeSexe(int value, String name, String literal) {
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

} //TypeSexe
