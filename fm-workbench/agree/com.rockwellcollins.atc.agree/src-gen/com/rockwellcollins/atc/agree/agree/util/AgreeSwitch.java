/**
 */
package com.rockwellcollins.atc.agree.agree.util;

import com.rockwellcollins.atc.agree.agree.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

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
 * @see com.rockwellcollins.atc.agree.agree.AgreePackage
 * @generated
 */
public class AgreeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AgreePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgreeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AgreePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AgreePackage.AGREE_LIBRARY:
      {
        AgreeLibrary agreeLibrary = (AgreeLibrary)theEObject;
        T result = caseAgreeLibrary(agreeLibrary);
        if (result == null) result = caseAnnexLibrary(agreeLibrary);
        if (result == null) result = caseNamedElement(agreeLibrary);
        if (result == null) result = caseElement(agreeLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.AGREE_SUBCLAUSE:
      {
        AgreeSubclause agreeSubclause = (AgreeSubclause)theEObject;
        T result = caseAgreeSubclause(agreeSubclause);
        if (result == null) result = caseAnnexSubclause(agreeSubclause);
        if (result == null) result = caseModalElement(agreeSubclause);
        if (result == null) result = caseNamedElement(agreeSubclause);
        if (result == null) result = caseElement(agreeSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.CONTRACT:
      {
        Contract contract = (Contract)theEObject;
        T result = caseContract(contract);
        if (result == null) result = caseElement(contract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.SPEC_STATEMENT:
      {
        SpecStatement specStatement = (SpecStatement)theEObject;
        T result = caseSpecStatement(specStatement);
        if (result == null) result = caseElement(specStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.CALL_DEF:
      {
        CallDef callDef = (CallDef)theEObject;
        T result = caseCallDef(callDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.PROPERTY_STATEMENT:
      {
        PropertyStatement propertyStatement = (PropertyStatement)theEObject;
        T result = casePropertyStatement(propertyStatement);
        if (result == null) result = caseNamedElement(propertyStatement);
        if (result == null) result = caseSpecStatement(propertyStatement);
        if (result == null) result = caseElement(propertyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.CONST_STATEMENT:
      {
        ConstStatement constStatement = (ConstStatement)theEObject;
        T result = caseConstStatement(constStatement);
        if (result == null) result = caseNamedElement(constStatement);
        if (result == null) result = caseSpecStatement(constStatement);
        if (result == null) result = caseElement(constStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.EQ_STATEMENT:
      {
        EqStatement eqStatement = (EqStatement)theEObject;
        T result = caseEqStatement(eqStatement);
        if (result == null) result = caseNamedElement(eqStatement);
        if (result == null) result = caseSpecStatement(eqStatement);
        if (result == null) result = caseElement(eqStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.FN_DEF_EXPR:
      {
        FnDefExpr fnDefExpr = (FnDefExpr)theEObject;
        T result = caseFnDefExpr(fnDefExpr);
        if (result == null) result = caseNamedElement(fnDefExpr);
        if (result == null) result = caseSpecStatement(fnDefExpr);
        if (result == null) result = caseCallDef(fnDefExpr);
        if (result == null) result = caseElement(fnDefExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.NODE_DEF_EXPR:
      {
        NodeDefExpr nodeDefExpr = (NodeDefExpr)theEObject;
        T result = caseNodeDefExpr(nodeDefExpr);
        if (result == null) result = caseNamedElement(nodeDefExpr);
        if (result == null) result = caseSpecStatement(nodeDefExpr);
        if (result == null) result = caseCallDef(nodeDefExpr);
        if (result == null) result = caseElement(nodeDefExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.NODE_BODY_EXPR:
      {
        NodeBodyExpr nodeBodyExpr = (NodeBodyExpr)theEObject;
        T result = caseNodeBodyExpr(nodeBodyExpr);
        if (result == null) result = caseElement(nodeBodyExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.NODE_EQ:
      {
        NodeEq nodeEq = (NodeEq)theEObject;
        T result = caseNodeEq(nodeEq);
        if (result == null) result = caseElement(nodeEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.ARG:
      {
        Arg arg = (Arg)theEObject;
        T result = caseArg(arg);
        if (result == null) result = caseNamedElement(arg);
        if (result == null) result = caseElement(arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseNamedElement(type);
        if (result == null) result = caseElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = caseElement(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.NESTED_DOT_ID:
      {
        NestedDotID nestedDotID = (NestedDotID)theEObject;
        T result = caseNestedDotID(nestedDotID);
        if (result == null) result = caseExpr(nestedDotID);
        if (result == null) result = caseElement(nestedDotID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.AGREE_CONTRACT_LIBRARY:
      {
        AgreeContractLibrary agreeContractLibrary = (AgreeContractLibrary)theEObject;
        T result = caseAgreeContractLibrary(agreeContractLibrary);
        if (result == null) result = caseAgreeLibrary(agreeContractLibrary);
        if (result == null) result = caseAnnexLibrary(agreeContractLibrary);
        if (result == null) result = caseNamedElement(agreeContractLibrary);
        if (result == null) result = caseElement(agreeContractLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.AGREE_CONTRACT_SUBCLAUSE:
      {
        AgreeContractSubclause agreeContractSubclause = (AgreeContractSubclause)theEObject;
        T result = caseAgreeContractSubclause(agreeContractSubclause);
        if (result == null) result = caseAgreeSubclause(agreeContractSubclause);
        if (result == null) result = caseAnnexSubclause(agreeContractSubclause);
        if (result == null) result = caseModalElement(agreeContractSubclause);
        if (result == null) result = caseNamedElement(agreeContractSubclause);
        if (result == null) result = caseElement(agreeContractSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.AGREE_CONTRACT:
      {
        AgreeContract agreeContract = (AgreeContract)theEObject;
        T result = caseAgreeContract(agreeContract);
        if (result == null) result = caseContract(agreeContract);
        if (result == null) result = caseElement(agreeContract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.ASSUME_STATEMENT:
      {
        AssumeStatement assumeStatement = (AssumeStatement)theEObject;
        T result = caseAssumeStatement(assumeStatement);
        if (result == null) result = caseSpecStatement(assumeStatement);
        if (result == null) result = caseElement(assumeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.GUARANTEE_STATEMENT:
      {
        GuaranteeStatement guaranteeStatement = (GuaranteeStatement)theEObject;
        T result = caseGuaranteeStatement(guaranteeStatement);
        if (result == null) result = caseSpecStatement(guaranteeStatement);
        if (result == null) result = caseElement(guaranteeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.ASSERT_STATEMENT:
      {
        AssertStatement assertStatement = (AssertStatement)theEObject;
        T result = caseAssertStatement(assertStatement);
        if (result == null) result = caseSpecStatement(assertStatement);
        if (result == null) result = caseElement(assertStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.PARAM_STATEMENT:
      {
        ParamStatement paramStatement = (ParamStatement)theEObject;
        T result = caseParamStatement(paramStatement);
        if (result == null) result = caseSpecStatement(paramStatement);
        if (result == null) result = caseElement(paramStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.BINARY_EXPR:
      {
        BinaryExpr binaryExpr = (BinaryExpr)theEObject;
        T result = caseBinaryExpr(binaryExpr);
        if (result == null) result = caseExpr(binaryExpr);
        if (result == null) result = caseElement(binaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = caseExpr(unaryExpr);
        if (result == null) result = caseElement(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.IF_THEN_ELSE_EXPR:
      {
        IfThenElseExpr ifThenElseExpr = (IfThenElseExpr)theEObject;
        T result = caseIfThenElseExpr(ifThenElseExpr);
        if (result == null) result = caseExpr(ifThenElseExpr);
        if (result == null) result = caseElement(ifThenElseExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.PREV_EXPR:
      {
        PrevExpr prevExpr = (PrevExpr)theEObject;
        T result = casePrevExpr(prevExpr);
        if (result == null) result = caseExpr(prevExpr);
        if (result == null) result = caseElement(prevExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.NEXT_EXPR:
      {
        NextExpr nextExpr = (NextExpr)theEObject;
        T result = caseNextExpr(nextExpr);
        if (result == null) result = caseExpr(nextExpr);
        if (result == null) result = caseElement(nextExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.GET_PROPERTY_EXPR:
      {
        GetPropertyExpr getPropertyExpr = (GetPropertyExpr)theEObject;
        T result = caseGetPropertyExpr(getPropertyExpr);
        if (result == null) result = caseExpr(getPropertyExpr);
        if (result == null) result = caseElement(getPropertyExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.ID_EXPR:
      {
        IdExpr idExpr = (IdExpr)theEObject;
        T result = caseIdExpr(idExpr);
        if (result == null) result = caseExpr(idExpr);
        if (result == null) result = caseElement(idExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.FN_CALL_EXPR:
      {
        FnCallExpr fnCallExpr = (FnCallExpr)theEObject;
        T result = caseFnCallExpr(fnCallExpr);
        if (result == null) result = caseExpr(fnCallExpr);
        if (result == null) result = caseElement(fnCallExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.INT_LIT_EXPR:
      {
        IntLitExpr intLitExpr = (IntLitExpr)theEObject;
        T result = caseIntLitExpr(intLitExpr);
        if (result == null) result = caseExpr(intLitExpr);
        if (result == null) result = caseElement(intLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.PRE_EXPR:
      {
        PreExpr preExpr = (PreExpr)theEObject;
        T result = casePreExpr(preExpr);
        if (result == null) result = caseExpr(preExpr);
        if (result == null) result = caseElement(preExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.REAL_LIT_EXPR:
      {
        RealLitExpr realLitExpr = (RealLitExpr)theEObject;
        T result = caseRealLitExpr(realLitExpr);
        if (result == null) result = caseExpr(realLitExpr);
        if (result == null) result = caseElement(realLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.BOOL_LIT_EXPR:
      {
        BoolLitExpr boolLitExpr = (BoolLitExpr)theEObject;
        T result = caseBoolLitExpr(boolLitExpr);
        if (result == null) result = caseExpr(boolLitExpr);
        if (result == null) result = caseElement(boolLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgreePackage.THIS_EXPR:
      {
        ThisExpr thisExpr = (ThisExpr)theEObject;
        T result = caseThisExpr(thisExpr);
        if (result == null) result = caseExpr(thisExpr);
        if (result == null) result = caseElement(thisExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgreeLibrary(AgreeLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgreeSubclause(AgreeSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContract(Contract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecStatement(SpecStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallDef(CallDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyStatement(PropertyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstStatement(ConstStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eq Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eq Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqStatement(EqStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fn Def Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fn Def Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFnDefExpr(FnDefExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Def Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Def Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeDefExpr(NodeDefExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Body Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Body Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeBodyExpr(NodeBodyExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Eq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Eq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeEq(NodeEq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArg(Arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Dot ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Dot ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedDotID(NestedDotID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contract Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contract Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgreeContractLibrary(AgreeContractLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contract Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contract Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgreeContractSubclause(AgreeContractSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgreeContract(AgreeContract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assume Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assume Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssumeStatement(AssumeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guarantee Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guarantee Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuaranteeStatement(GuaranteeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertStatement(AssertStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamStatement(ParamStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpr(BinaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpr(UnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElseExpr(IfThenElseExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prev Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prev Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrevExpr(PrevExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Next Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Next Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNextExpr(NextExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Property Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Property Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetPropertyExpr(GetPropertyExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdExpr(IdExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fn Call Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fn Call Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFnCallExpr(FnCallExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLitExpr(IntLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreExpr(PreExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealLitExpr(RealLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolLitExpr(BoolLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThisExpr(ThisExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexLibrary(AnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModalElement(ModalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexSubclause(AnnexSubclause object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AgreeSwitch