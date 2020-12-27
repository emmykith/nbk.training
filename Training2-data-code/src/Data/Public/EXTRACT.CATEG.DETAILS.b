$PACKAGE XX.Sample
SUBROUTINE EXTRACT.CATEG.DETAILS
*-----------------------------------------------------------------------------
*
*-----------------------------------------------------------------------------
* Modification History :
*-----------------------------------------------------------------------------

*-----------------------------------------------------------------------------
    $INSERT I_COMMON
    $INSERT I_EQUATE
    $INSERT I_ENQUIRY.COMMON
    $INSERT I_F.CATEGORY

    FA.CATEG = "F.CATEGORY"
    FV.CATEG = ""
    CALL OPF(FA.CATEG,FV.CATEG)

    Y.IDD = O.DATA
    CALL F.READ(FA.CATEG,Y.IDD,Y.REC,FV.CATEG,READ.ERROR)
    Y.DETAILS = Y.REC<EB.CAT.SHORT.NAME>
    O.DATA = Y.DETAILS

END
