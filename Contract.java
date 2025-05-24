public interface Contract {
    void BuildContractId(String contractId);

    void BuildPropertyId(String propertyId);

    void BuildTenantId(String tenantId);

    void BuildRentAmount(double rentAmount);

    void SignContract(String Contract);
}