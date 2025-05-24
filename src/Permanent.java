public class Permanent implements Contract{
    private String contractId;
    private double rentAmount;
    private String tenantId;
    private String propertyId;
    public void Permanent(String contractId, double rentAmount, String tenantId, String propertyId){
        this.contractId = contractId;
        this.rentAmount = rentAmount;
        this.tenantId = tenantId;
        this.propertyId = propertyId;
    }
    @Override
    public void BuildContractId(String contractId) {
        System.out.println("Contract ID: " + contractId);
    }
    @Override
    public void BuildPropertyId(String propertyId) {
        System.out.println("Property ID: " + propertyId);
    }
    @Override
    public void BuildTenantId(String tenantId) {
        System.out.println("Tenant ID: " + tenantId);
    }
    @Override
    public void BuildRentAmount(double rentAmount) {
        System.out.println("Rent Amount: " + rentAmount);
    }
}
