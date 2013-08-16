/**
 */
package com.rockwellcollins.atc.resolute.resolute.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.rockwellcollins.atc.resolute.resolute.ClaimBody;
import com.rockwellcollins.atc.resolute.resolute.ClaimString;
import com.rockwellcollins.atc.resolute.resolute.ResolutePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Claim Body</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.rockwellcollins.atc.resolute.resolute.impl.ClaimBodyImpl#getClaim
 * <em>Claim</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClaimBodyImpl extends DefinitionBodyImpl implements ClaimBody {
    /**
     * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getClaim()
     * @generated
     * @ordered
     */
    protected EList<ClaimString> claim;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ClaimBodyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResolutePackage.Literals.CLAIM_BODY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ClaimString> getClaim() {
        if (claim == null) {
            claim = new EObjectContainmentEList<ClaimString>(ClaimString.class, this,
                    ResolutePackage.CLAIM_BODY__CLAIM);
        }
        return claim;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case ResolutePackage.CLAIM_BODY__CLAIM:
            return ((InternalEList<?>) getClaim()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ResolutePackage.CLAIM_BODY__CLAIM:
            return getClaim();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ResolutePackage.CLAIM_BODY__CLAIM:
            getClaim().clear();
            getClaim().addAll((Collection<? extends ClaimString>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ResolutePackage.CLAIM_BODY__CLAIM:
            getClaim().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ResolutePackage.CLAIM_BODY__CLAIM:
            return claim != null && !claim.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ClaimBodyImpl