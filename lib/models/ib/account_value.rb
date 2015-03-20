module IB
  # This is a single data point delivered by HistoricData or RealTimeBar messages.
  # Instantiate with a Hash of attributes, to be auto-set via initialize in Model.
  class AccountValue < IB::Model
    include BaseProperties

    belongs_to :account 

    prop  :key,
	  :value,
	  :currency


    # Order comparison
    def == other
      super(other) ||
        other.is_a?(self.class) &&
        key == other.key &&
        currency == other.currency &&
        value == other.value 
    end
    def default_attributes
      super.merge key: 'AccountValue',
	value: 0,
	currency: 'USD'
    end

    def to_human
       "#{key}=#{value} #{currency}>"
    end

    alias to_s to_human
  end # class Bar
end # module IB
