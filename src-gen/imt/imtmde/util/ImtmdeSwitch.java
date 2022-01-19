/**
 */
package imt.imtmde.util;

import imt.imtmde.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see imt.imtmde.ImtmdePackage
 * @generated
 */
public class ImtmdeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImtmdePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImtmdeSwitch() {
		if (modelPackage == null) {
			modelPackage = ImtmdePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ImtmdePackage.ADRESSE: {
			Adresse adresse = (Adresse) theEObject;
			T result = caseAdresse(adresse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.COMPETITION: {
			Competition competition = (Competition) theEObject;
			T result = caseCompetition(competition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.CLUB: {
			Club club = (Club) theEObject;
			T result = caseClub(club);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.MATCH: {
			Match match = (Match) theEObject;
			T result = caseMatch(match);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.RESULTAT: {
			Resultat resultat = (Resultat) theEObject;
			T result = caseResultat(resultat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.TIREUR: {
			Tireur tireur = (Tireur) theEObject;
			T result = caseTireur(tireur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.FLEURETTISTE: {
			Fleurettiste fleurettiste = (Fleurettiste) theEObject;
			T result = caseFleurettiste(fleurettiste);
			if (result == null)
				result = caseTireur(fleurettiste);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.EPEISTE: {
			Epeiste epeiste = (Epeiste) theEObject;
			T result = caseEpeiste(epeiste);
			if (result == null)
				result = caseTireur(epeiste);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ImtmdePackage.SABREUR: {
			Sabreur sabreur = (Sabreur) theEObject;
			T result = caseSabreur(sabreur);
			if (result == null)
				result = caseTireur(sabreur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adresse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adresse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdresse(Adresse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Competition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Competition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompetition(Competition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Club</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Club</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClub(Club object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatch(Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultat(Resultat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tireur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tireur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTireur(Tireur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fleurettiste</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fleurettiste</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFleurettiste(Fleurettiste object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epeiste</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epeiste</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpeiste(Epeiste object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sabreur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sabreur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSabreur(Sabreur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ImtmdeSwitch
