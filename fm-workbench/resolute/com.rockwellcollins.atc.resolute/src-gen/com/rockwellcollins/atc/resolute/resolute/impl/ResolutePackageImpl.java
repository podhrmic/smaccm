/**
 */
package com.rockwellcollins.atc.resolute.resolute.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.osate.aadl2.Aadl2Package;

import com.rockwellcollins.atc.resolute.resolute.Arg;
import com.rockwellcollins.atc.resolute.resolute.BinaryExpr;
import com.rockwellcollins.atc.resolute.resolute.BoolExpr;
import com.rockwellcollins.atc.resolute.resolute.BuiltInFuncCallExpr;
import com.rockwellcollins.atc.resolute.resolute.BuiltinType;
import com.rockwellcollins.atc.resolute.resolute.ClaimArg;
import com.rockwellcollins.atc.resolute.resolute.ClaimBody;
import com.rockwellcollins.atc.resolute.resolute.ClaimString;
import com.rockwellcollins.atc.resolute.resolute.ConstantDefinition;
import com.rockwellcollins.atc.resolute.resolute.Definition;
import com.rockwellcollins.atc.resolute.resolute.DefinitionBody;
import com.rockwellcollins.atc.resolute.resolute.Expr;
import com.rockwellcollins.atc.resolute.resolute.FailExpr;
import com.rockwellcollins.atc.resolute.resolute.FilterMapExpr;
import com.rockwellcollins.atc.resolute.resolute.FnCallExpr;
import com.rockwellcollins.atc.resolute.resolute.FuncBody;
import com.rockwellcollins.atc.resolute.resolute.FunctionDefinition;
import com.rockwellcollins.atc.resolute.resolute.IdExpr;
import com.rockwellcollins.atc.resolute.resolute.IfThenElseExpr;
import com.rockwellcollins.atc.resolute.resolute.IntExpr;
import com.rockwellcollins.atc.resolute.resolute.ProveStatement;
import com.rockwellcollins.atc.resolute.resolute.QuantifiedExpr;
import com.rockwellcollins.atc.resolute.resolute.RealExpr;
import com.rockwellcollins.atc.resolute.resolute.ResoluteFactory;
import com.rockwellcollins.atc.resolute.resolute.ResoluteLibrary;
import com.rockwellcollins.atc.resolute.resolute.ResolutePackage;
import com.rockwellcollins.atc.resolute.resolute.ResoluteSubclause;
import com.rockwellcollins.atc.resolute.resolute.SetType;
import com.rockwellcollins.atc.resolute.resolute.StringExpr;
import com.rockwellcollins.atc.resolute.resolute.ThisExpr;
import com.rockwellcollins.atc.resolute.resolute.Type;
import com.rockwellcollins.atc.resolute.resolute.UnaryExpr;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ResolutePackageImpl extends EPackageImpl implements ResolutePackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass resoluteLibraryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass definitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass typeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass builtinTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass argEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass constantDefinitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass functionDefinitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass claimStringEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass definitionBodyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass exprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass resoluteSubclauseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass proveStatementEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass setTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass claimArgEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass funcBodyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass claimBodyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass binaryExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass unaryExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass idExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass thisExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass failExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass intExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass realExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass boolExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass stringExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass ifThenElseExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass quantifiedExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass builtInFuncCallExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass fnCallExprEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass filterMapExprEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.rockwellcollins.atc.resolute.resolute.ResolutePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ResolutePackageImpl() {
        super(eNS_URI, ResoluteFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link ResolutePackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ResolutePackage init() {
        if (isInited) {
            return (ResolutePackage) EPackage.Registry.INSTANCE
                    .getEPackage(ResolutePackage.eNS_URI);
        }

        // Obtain or create and register package
        ResolutePackageImpl theResolutePackage = (ResolutePackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ResolutePackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new ResolutePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        Aadl2Package.eINSTANCE.eClass();

        // Create package meta-data objects
        theResolutePackage.createPackageContents();

        // Initialize created meta-data
        theResolutePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theResolutePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ResolutePackage.eNS_URI, theResolutePackage);
        return theResolutePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getResoluteLibrary() {
        return resoluteLibraryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResoluteLibrary_Definitions() {
        return (EReference) resoluteLibraryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDefinition() {
        return definitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getType() {
        return typeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBuiltinType() {
        return builtinTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getArg() {
        return argEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getArg_Type() {
        return (EReference) argEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getConstantDefinition() {
        return constantDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getConstantDefinition_Type() {
        return (EReference) constantDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getConstantDefinition_Expr() {
        return (EReference) constantDefinitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFunctionDefinition() {
        return functionDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFunctionDefinition_Args() {
        return (EReference) functionDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFunctionDefinition_Body() {
        return (EReference) functionDefinitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getClaimString() {
        return claimStringEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getClaimString_Str() {
        return (EAttribute) claimStringEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDefinitionBody() {
        return definitionBodyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getDefinitionBody_Expr() {
        return (EReference) definitionBodyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExpr() {
        return exprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getResoluteSubclause() {
        return resoluteSubclauseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResoluteSubclause_Proves() {
        return (EReference) resoluteSubclauseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProveStatement() {
        return proveStatementEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProveStatement_Expr() {
        return (EReference) proveStatementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSetType() {
        return setTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSetType_Type() {
        return (EReference) setTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getClaimArg() {
        return claimArgEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getClaimArg_Arg() {
        return (EReference) claimArgEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFuncBody() {
        return funcBodyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFuncBody_Type() {
        return (EReference) funcBodyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getClaimBody() {
        return claimBodyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getClaimBody_Claim() {
        return (EReference) claimBodyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBinaryExpr() {
        return binaryExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBinaryExpr_Left() {
        return (EReference) binaryExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getBinaryExpr_Op() {
        return (EAttribute) binaryExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBinaryExpr_Right() {
        return (EReference) binaryExprEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUnaryExpr() {
        return unaryExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getUnaryExpr_Op() {
        return (EAttribute) unaryExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUnaryExpr_Expr() {
        return (EReference) unaryExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIdExpr() {
        return idExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIdExpr_Id() {
        return (EReference) idExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getThisExpr() {
        return thisExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFailExpr() {
        return failExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFailExpr_Val() {
        return (EReference) failExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIntExpr() {
        return intExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIntExpr_Val() {
        return (EReference) intExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRealExpr() {
        return realExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRealExpr_Val() {
        return (EReference) realExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBoolExpr() {
        return boolExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBoolExpr_Val() {
        return (EReference) boolExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getStringExpr() {
        return stringExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getStringExpr_Val() {
        return (EReference) stringExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIfThenElseExpr() {
        return ifThenElseExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIfThenElseExpr_Cond() {
        return (EReference) ifThenElseExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIfThenElseExpr_Then() {
        return (EReference) ifThenElseExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getIfThenElseExpr_Else() {
        return (EReference) ifThenElseExprEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getQuantifiedExpr() {
        return quantifiedExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getQuantifiedExpr_Quant() {
        return (EAttribute) quantifiedExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getQuantifiedExpr_Args() {
        return (EReference) quantifiedExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getQuantifiedExpr_Expr() {
        return (EReference) quantifiedExprEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBuiltInFuncCallExpr() {
        return builtInFuncCallExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getBuiltInFuncCallExpr_Fn() {
        return (EAttribute) builtInFuncCallExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBuiltInFuncCallExpr_Args() {
        return (EReference) builtInFuncCallExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFnCallExpr() {
        return fnCallExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFnCallExpr_Fn() {
        return (EReference) fnCallExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFnCallExpr_Args() {
        return (EReference) fnCallExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFilterMapExpr() {
        return filterMapExprEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFilterMapExpr_Map() {
        return (EReference) filterMapExprEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFilterMapExpr_Args() {
        return (EReference) filterMapExprEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFilterMapExpr_Filter() {
        return (EReference) filterMapExprEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResoluteFactory getResoluteFactory() {
        return (ResoluteFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to
     * have no affect on any invocation but its first. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) {
            return;
        }
        isCreated = true;

        // Create classes and their features
        resoluteLibraryEClass = createEClass(RESOLUTE_LIBRARY);
        createEReference(resoluteLibraryEClass, RESOLUTE_LIBRARY__DEFINITIONS);

        definitionEClass = createEClass(DEFINITION);

        typeEClass = createEClass(TYPE);

        builtinTypeEClass = createEClass(BUILTIN_TYPE);

        argEClass = createEClass(ARG);
        createEReference(argEClass, ARG__TYPE);

        constantDefinitionEClass = createEClass(CONSTANT_DEFINITION);
        createEReference(constantDefinitionEClass, CONSTANT_DEFINITION__TYPE);
        createEReference(constantDefinitionEClass, CONSTANT_DEFINITION__EXPR);

        functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
        createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__ARGS);
        createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__BODY);

        claimStringEClass = createEClass(CLAIM_STRING);
        createEAttribute(claimStringEClass, CLAIM_STRING__STR);

        definitionBodyEClass = createEClass(DEFINITION_BODY);
        createEReference(definitionBodyEClass, DEFINITION_BODY__EXPR);

        exprEClass = createEClass(EXPR);

        resoluteSubclauseEClass = createEClass(RESOLUTE_SUBCLAUSE);
        createEReference(resoluteSubclauseEClass, RESOLUTE_SUBCLAUSE__PROVES);

        proveStatementEClass = createEClass(PROVE_STATEMENT);
        createEReference(proveStatementEClass, PROVE_STATEMENT__EXPR);

        setTypeEClass = createEClass(SET_TYPE);
        createEReference(setTypeEClass, SET_TYPE__TYPE);

        claimArgEClass = createEClass(CLAIM_ARG);
        createEReference(claimArgEClass, CLAIM_ARG__ARG);

        funcBodyEClass = createEClass(FUNC_BODY);
        createEReference(funcBodyEClass, FUNC_BODY__TYPE);

        claimBodyEClass = createEClass(CLAIM_BODY);
        createEReference(claimBodyEClass, CLAIM_BODY__CLAIM);

        binaryExprEClass = createEClass(BINARY_EXPR);
        createEReference(binaryExprEClass, BINARY_EXPR__LEFT);
        createEAttribute(binaryExprEClass, BINARY_EXPR__OP);
        createEReference(binaryExprEClass, BINARY_EXPR__RIGHT);

        unaryExprEClass = createEClass(UNARY_EXPR);
        createEAttribute(unaryExprEClass, UNARY_EXPR__OP);
        createEReference(unaryExprEClass, UNARY_EXPR__EXPR);

        idExprEClass = createEClass(ID_EXPR);
        createEReference(idExprEClass, ID_EXPR__ID);

        thisExprEClass = createEClass(THIS_EXPR);

        failExprEClass = createEClass(FAIL_EXPR);
        createEReference(failExprEClass, FAIL_EXPR__VAL);

        intExprEClass = createEClass(INT_EXPR);
        createEReference(intExprEClass, INT_EXPR__VAL);

        realExprEClass = createEClass(REAL_EXPR);
        createEReference(realExprEClass, REAL_EXPR__VAL);

        boolExprEClass = createEClass(BOOL_EXPR);
        createEReference(boolExprEClass, BOOL_EXPR__VAL);

        stringExprEClass = createEClass(STRING_EXPR);
        createEReference(stringExprEClass, STRING_EXPR__VAL);

        ifThenElseExprEClass = createEClass(IF_THEN_ELSE_EXPR);
        createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__COND);
        createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__THEN);
        createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__ELSE);

        quantifiedExprEClass = createEClass(QUANTIFIED_EXPR);
        createEAttribute(quantifiedExprEClass, QUANTIFIED_EXPR__QUANT);
        createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__ARGS);
        createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__EXPR);

        builtInFuncCallExprEClass = createEClass(BUILT_IN_FUNC_CALL_EXPR);
        createEAttribute(builtInFuncCallExprEClass, BUILT_IN_FUNC_CALL_EXPR__FN);
        createEReference(builtInFuncCallExprEClass, BUILT_IN_FUNC_CALL_EXPR__ARGS);

        fnCallExprEClass = createEClass(FN_CALL_EXPR);
        createEReference(fnCallExprEClass, FN_CALL_EXPR__FN);
        createEReference(fnCallExprEClass, FN_CALL_EXPR__ARGS);

        filterMapExprEClass = createEClass(FILTER_MAP_EXPR);
        createEReference(filterMapExprEClass, FILTER_MAP_EXPR__MAP);
        createEReference(filterMapExprEClass, FILTER_MAP_EXPR__ARGS);
        createEReference(filterMapExprEClass, FILTER_MAP_EXPR__FILTER);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This
     * method is guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        Aadl2Package theAadl2Package = (Aadl2Package) EPackage.Registry.INSTANCE
                .getEPackage(Aadl2Package.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        resoluteLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
        definitionEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
        typeEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
        builtinTypeEClass.getESuperTypes().add(this.getType());
        argEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
        constantDefinitionEClass.getESuperTypes().add(this.getDefinition());
        functionDefinitionEClass.getESuperTypes().add(this.getDefinition());
        claimStringEClass.getESuperTypes().add(theAadl2Package.getElement());
        definitionBodyEClass.getESuperTypes().add(theAadl2Package.getElement());
        exprEClass.getESuperTypes().add(theAadl2Package.getElement());
        resoluteSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
        proveStatementEClass.getESuperTypes().add(theAadl2Package.getElement());
        setTypeEClass.getESuperTypes().add(this.getType());
        claimArgEClass.getESuperTypes().add(this.getClaimString());
        funcBodyEClass.getESuperTypes().add(this.getDefinitionBody());
        claimBodyEClass.getESuperTypes().add(this.getDefinitionBody());
        binaryExprEClass.getESuperTypes().add(this.getExpr());
        unaryExprEClass.getESuperTypes().add(this.getExpr());
        idExprEClass.getESuperTypes().add(this.getExpr());
        thisExprEClass.getESuperTypes().add(this.getExpr());
        failExprEClass.getESuperTypes().add(this.getExpr());
        intExprEClass.getESuperTypes().add(this.getExpr());
        realExprEClass.getESuperTypes().add(this.getExpr());
        boolExprEClass.getESuperTypes().add(this.getExpr());
        stringExprEClass.getESuperTypes().add(this.getExpr());
        ifThenElseExprEClass.getESuperTypes().add(this.getExpr());
        quantifiedExprEClass.getESuperTypes().add(this.getExpr());
        builtInFuncCallExprEClass.getESuperTypes().add(this.getExpr());
        fnCallExprEClass.getESuperTypes().add(this.getExpr());
        filterMapExprEClass.getESuperTypes().add(this.getExpr());

        // Initialize classes and features; add operations and parameters
        initEClass(resoluteLibraryEClass, ResoluteLibrary.class, "ResoluteLibrary", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResoluteLibrary_Definitions(), this.getDefinition(), null, "definitions",
                null, 0, -1, ResoluteLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(builtinTypeEClass, BuiltinType.class, "BuiltinType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(argEClass, Arg.class, "Arg", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArg_Type(), this.getType(), null, "type", null, 0, 1, Arg.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constantDefinitionEClass, ConstantDefinition.class, "ConstantDefinition",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstantDefinition_Type(), this.getType(), null, "type", null, 0, 1,
                ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConstantDefinition_Expr(), this.getExpr(), null, "expr", null, 0, 1,
                ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFunctionDefinition_Args(), this.getArg(), null, "args", null, 0, -1,
                FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFunctionDefinition_Body(), this.getDefinitionBody(), null, "body", null,
                0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(claimStringEClass, ClaimString.class, "ClaimString", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClaimString_Str(), ecorePackage.getEString(), "str", null, 0, 1,
                ClaimString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(definitionBodyEClass, DefinitionBody.class, "DefinitionBody", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDefinitionBody_Expr(), this.getExpr(), null, "expr", null, 0, 1,
                DefinitionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(resoluteSubclauseEClass, ResoluteSubclause.class, "ResoluteSubclause",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResoluteSubclause_Proves(), this.getProveStatement(), null, "proves",
                null, 0, -1, ResoluteSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(proveStatementEClass, ProveStatement.class, "ProveStatement", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProveStatement_Expr(), this.getExpr(), null, "expr", null, 0, 1,
                ProveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSetType_Type(), this.getType(), null, "type", null, 0, 1, SetType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(claimArgEClass, ClaimArg.class, "ClaimArg", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClaimArg_Arg(), this.getArg(), null, "arg", null, 0, 1, ClaimArg.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(funcBodyEClass, FuncBody.class, "FuncBody", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFuncBody_Type(), this.getType(), null, "type", null, 0, 1,
                FuncBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(claimBodyEClass, ClaimBody.class, "ClaimBody", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClaimBody_Claim(), this.getClaimString(), null, "claim", null, 0, -1,
                ClaimBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(binaryExprEClass, BinaryExpr.class, "BinaryExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBinaryExpr_Left(), this.getExpr(), null, "left", null, 0, 1,
                BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBinaryExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1,
                BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBinaryExpr_Right(), this.getExpr(), null, "right", null, 0, 1,
                BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUnaryExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1,
                UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUnaryExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1,
                UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(idExprEClass, IdExpr.class, "IdExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdExpr_Id(), theAadl2Package.getNamedElement(), null, "id", null, 0, 1,
                IdExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(thisExprEClass, ThisExpr.class, "ThisExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(failExprEClass, FailExpr.class, "FailExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFailExpr_Val(), theAadl2Package.getStringLiteral(), null, "val", null, 0,
                1, FailExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intExprEClass, IntExpr.class, "IntExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIntExpr_Val(), theAadl2Package.getIntegerLiteral(), null, "val", null, 0,
                1, IntExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(realExprEClass, RealExpr.class, "RealExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRealExpr_Val(), theAadl2Package.getRealLiteral(), null, "val", null, 0,
                1, RealExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boolExprEClass, BoolExpr.class, "BoolExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBoolExpr_Val(), theAadl2Package.getBooleanLiteral(), null, "val", null,
                0, 1, BoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stringExprEClass, StringExpr.class, "StringExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStringExpr_Val(), theAadl2Package.getStringLiteral(), null, "val", null,
                0, 1, StringExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ifThenElseExprEClass, IfThenElseExpr.class, "IfThenElseExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIfThenElseExpr_Cond(), this.getExpr(), null, "cond", null, 0, 1,
                IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIfThenElseExpr_Then(), this.getExpr(), null, "then", null, 0, 1,
                IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIfThenElseExpr_Else(), this.getExpr(), null, "else", null, 0, 1,
                IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(quantifiedExprEClass, QuantifiedExpr.class, "QuantifiedExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getQuantifiedExpr_Quant(), ecorePackage.getEString(), "quant", null, 0, 1,
                QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQuantifiedExpr_Args(), this.getArg(), null, "args", null, 0, -1,
                QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQuantifiedExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1,
                QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(builtInFuncCallExprEClass, BuiltInFuncCallExpr.class, "BuiltInFuncCallExpr",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBuiltInFuncCallExpr_Fn(), ecorePackage.getEString(), "fn", null, 0, 1,
                BuiltInFuncCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBuiltInFuncCallExpr_Args(), this.getExpr(), null, "args", null, 0, -1,
                BuiltInFuncCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(fnCallExprEClass, FnCallExpr.class, "FnCallExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFnCallExpr_Fn(), this.getFunctionDefinition(), null, "fn", null, 0, 1,
                FnCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFnCallExpr_Args(), this.getExpr(), null, "args", null, 0, -1,
                FnCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(filterMapExprEClass, FilterMapExpr.class, "FilterMapExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFilterMapExpr_Map(), this.getExpr(), null, "map", null, 0, 1,
                FilterMapExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFilterMapExpr_Args(), this.getArg(), null, "args", null, 0, -1,
                FilterMapExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFilterMapExpr_Filter(), this.getExpr(), null, "filter", null, 0, 1,
                FilterMapExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // ResolutePackageImpl