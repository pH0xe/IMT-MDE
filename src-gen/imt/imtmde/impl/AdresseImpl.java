/**
 */
package imt.imtmde.impl;

import imt.imtmde.Adresse;
import imt.imtmde.ImtmdePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.impl.AdresseImpl#getAdressePostale <em>Adresse Postale</em>}</li>
 *   <li>{@link imt.imtmde.impl.AdresseImpl#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link imt.imtmde.impl.AdresseImpl#getVille <em>Ville</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdresseImpl extends MinimalEObjectImpl.Container implements Adresse {
	/**
	 * The default value of the '{@link #getAdressePostale() <em>Adresse Postale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressePostale()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_POSTALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdressePostale() <em>Adresse Postale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressePostale()
	 * @generated
	 * @ordered
	 */
	protected String adressePostale = ADRESSE_POSTALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_POSTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected int codePostal = CODE_POSTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected String ville = VILLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdresseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImtmdePackage.Literals.ADRESSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdressePostale() {
		return adressePostale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdressePostale(String newAdressePostale) {
		String oldAdressePostale = adressePostale;
		adressePostale = newAdressePostale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.ADRESSE__ADRESSE_POSTALE,
					oldAdressePostale, adressePostale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePostal(int newCodePostal) {
		int oldCodePostal = codePostal;
		codePostal = newCodePostal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.ADRESSE__CODE_POSTAL, oldCodePostal,
					codePostal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(String newVille) {
		String oldVille = ville;
		ville = newVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.ADRESSE__VILLE, oldVille, ville));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImtmdePackage.ADRESSE__ADRESSE_POSTALE:
			return getAdressePostale();
		case ImtmdePackage.ADRESSE__CODE_POSTAL:
			return getCodePostal();
		case ImtmdePackage.ADRESSE__VILLE:
			return getVille();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ImtmdePackage.ADRESSE__ADRESSE_POSTALE:
			setAdressePostale((String) newValue);
			return;
		case ImtmdePackage.ADRESSE__CODE_POSTAL:
			setCodePostal((Integer) newValue);
			return;
		case ImtmdePackage.ADRESSE__VILLE:
			setVille((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ImtmdePackage.ADRESSE__ADRESSE_POSTALE:
			setAdressePostale(ADRESSE_POSTALE_EDEFAULT);
			return;
		case ImtmdePackage.ADRESSE__CODE_POSTAL:
			setCodePostal(CODE_POSTAL_EDEFAULT);
			return;
		case ImtmdePackage.ADRESSE__VILLE:
			setVille(VILLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ImtmdePackage.ADRESSE__ADRESSE_POSTALE:
			return ADRESSE_POSTALE_EDEFAULT == null ? adressePostale != null
					: !ADRESSE_POSTALE_EDEFAULT.equals(adressePostale);
		case ImtmdePackage.ADRESSE__CODE_POSTAL:
			return codePostal != CODE_POSTAL_EDEFAULT;
		case ImtmdePackage.ADRESSE__VILLE:
			return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adressePostale: ");
		result.append(adressePostale);
		result.append(", codePostal: ");
		result.append(codePostal);
		result.append(", ville: ");
		result.append(ville);
		result.append(')');
		return result.toString();
	}

} //AdresseImpl
