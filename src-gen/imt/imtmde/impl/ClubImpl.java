/**
 */
package imt.imtmde.impl;

import imt.imtmde.Adresse;
import imt.imtmde.Club;
import imt.imtmde.ImtmdePackage;
import imt.imtmde.Tireur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Club</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.impl.ClubImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link imt.imtmde.impl.ClubImpl#getTireur <em>Tireur</em>}</li>
 *   <li>{@link imt.imtmde.impl.ClubImpl#getAdresse <em>Adresse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClubImpl extends MinimalEObjectImpl.Container implements Club {
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
	 * The cached value of the '{@link #getTireur() <em>Tireur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTireur()
	 * @generated
	 * @ordered
	 */
	protected EList<Tireur> tireur;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected Adresse adresse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImtmdePackage.Literals.CLUB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.CLUB__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tireur> getTireur() {
		if (tireur == null) {
			tireur = new EObjectContainmentEList<Tireur>(Tireur.class, this, ImtmdePackage.CLUB__TIREUR);
		}
		return tireur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdresse(Adresse newAdresse, NotificationChain msgs) {
		Adresse oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImtmdePackage.CLUB__ADRESSE,
					oldAdresse, newAdresse);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(Adresse newAdresse) {
		if (newAdresse != adresse) {
			NotificationChain msgs = null;
			if (adresse != null)
				msgs = ((InternalEObject) adresse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ImtmdePackage.CLUB__ADRESSE, null, msgs);
			if (newAdresse != null)
				msgs = ((InternalEObject) newAdresse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ImtmdePackage.CLUB__ADRESSE, null, msgs);
			msgs = basicSetAdresse(newAdresse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.CLUB__ADRESSE, newAdresse, newAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImtmdePackage.CLUB__TIREUR:
			return ((InternalEList<?>) getTireur()).basicRemove(otherEnd, msgs);
		case ImtmdePackage.CLUB__ADRESSE:
			return basicSetAdresse(null, msgs);
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
		case ImtmdePackage.CLUB__NOM:
			return getNom();
		case ImtmdePackage.CLUB__TIREUR:
			return getTireur();
		case ImtmdePackage.CLUB__ADRESSE:
			return getAdresse();
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
		case ImtmdePackage.CLUB__NOM:
			setNom((String) newValue);
			return;
		case ImtmdePackage.CLUB__TIREUR:
			getTireur().clear();
			getTireur().addAll((Collection<? extends Tireur>) newValue);
			return;
		case ImtmdePackage.CLUB__ADRESSE:
			setAdresse((Adresse) newValue);
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
		case ImtmdePackage.CLUB__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case ImtmdePackage.CLUB__TIREUR:
			getTireur().clear();
			return;
		case ImtmdePackage.CLUB__ADRESSE:
			setAdresse((Adresse) null);
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
		case ImtmdePackage.CLUB__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case ImtmdePackage.CLUB__TIREUR:
			return tireur != null && !tireur.isEmpty();
		case ImtmdePackage.CLUB__ADRESSE:
			return adresse != null;
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
		result.append(')');
		return result.toString();
	}

} //ClubImpl
