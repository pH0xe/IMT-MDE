/**
 */
package imt.imtmde.impl;

import imt.imtmde.ImtmdePackage;
import imt.imtmde.Match;
import imt.imtmde.Tireur;
import imt.imtmde.TypeCategorie;
import imt.imtmde.TypeSexe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tireur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.impl.TireurImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link imt.imtmde.impl.TireurImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link imt.imtmde.impl.TireurImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link imt.imtmde.impl.TireurImpl#getSexe <em>Sexe</em>}</li>
 *   <li>{@link imt.imtmde.impl.TireurImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TireurImpl extends MinimalEObjectImpl.Container implements Tireur {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeCategorie CATEGORIE_EDEFAULT = TypeCategorie.M15;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected static final TypeSexe SEXE_EDEFAULT = TypeSexe.FEMME;

	/**
	 * The cached value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected TypeSexe sexe = SEXE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TireurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImtmdePackage.Literals.TIREUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.TIREUR__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.TIREUR__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeCategorie newCategorie) {
		TypeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.TIREUR__CATEGORIE, oldCategorie,
					categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSexe getSexe() {
		return sexe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSexe(TypeSexe newSexe) {
		TypeSexe oldSexe = sexe;
		sexe = newSexe == null ? SEXE_EDEFAULT : newSexe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.TIREUR__SEXE, oldSexe, sexe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectWithInverseResolvingEList.ManyInverse<Match>(Match.class, this,
					ImtmdePackage.TIREUR__MATCH, ImtmdePackage.MATCH__TIREURS);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImtmdePackage.TIREUR__MATCH:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMatch()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImtmdePackage.TIREUR__MATCH:
			return ((InternalEList<?>) getMatch()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImtmdePackage.TIREUR__NOM:
			return getNom();
		case ImtmdePackage.TIREUR__PRENOM:
			return getPrenom();
		case ImtmdePackage.TIREUR__CATEGORIE:
			return getCategorie();
		case ImtmdePackage.TIREUR__SEXE:
			return getSexe();
		case ImtmdePackage.TIREUR__MATCH:
			return getMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ImtmdePackage.TIREUR__NOM:
			setNom((String) newValue);
			return;
		case ImtmdePackage.TIREUR__PRENOM:
			setPrenom((String) newValue);
			return;
		case ImtmdePackage.TIREUR__CATEGORIE:
			setCategorie((TypeCategorie) newValue);
			return;
		case ImtmdePackage.TIREUR__SEXE:
			setSexe((TypeSexe) newValue);
			return;
		case ImtmdePackage.TIREUR__MATCH:
			getMatch().clear();
			getMatch().addAll((Collection<? extends Match>) newValue);
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
		case ImtmdePackage.TIREUR__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case ImtmdePackage.TIREUR__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case ImtmdePackage.TIREUR__CATEGORIE:
			setCategorie(CATEGORIE_EDEFAULT);
			return;
		case ImtmdePackage.TIREUR__SEXE:
			setSexe(SEXE_EDEFAULT);
			return;
		case ImtmdePackage.TIREUR__MATCH:
			getMatch().clear();
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
		case ImtmdePackage.TIREUR__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case ImtmdePackage.TIREUR__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case ImtmdePackage.TIREUR__CATEGORIE:
			return categorie != CATEGORIE_EDEFAULT;
		case ImtmdePackage.TIREUR__SEXE:
			return sexe != SEXE_EDEFAULT;
		case ImtmdePackage.TIREUR__MATCH:
			return match != null && !match.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(", categorie: ");
		result.append(categorie);
		result.append(", sexe: ");
		result.append(sexe);
		result.append(')');
		return result.toString();
	}

} //TireurImpl
